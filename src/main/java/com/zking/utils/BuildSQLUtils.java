package com.zking.utils;



import com.zking.base.BaseEntity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BuildSQLUtils {

    public String BuildSQLForInsert(BaseEntity entity) {
        Class<? extends BaseEntity> clazz = entity.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("INSERT INTO " + correctTableName(clazz.getSimpleName()));
        StringBuffer value = new StringBuffer();
        StringBuffer values = new StringBuffer();
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            try {
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object object = field.get(entity);
                    if (object != null) {
                        value.append(field.getName() + ",");
                        values.append("'" + field.getName() + "',");
                    }
                }
                if (value != null && values != null) {
                    value.deleteCharAt(value.length() - 1);
                    values.deleteCharAt(values.length() - 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        stringBuffer.append(" (" + value + ") " + "VALUES (" + values + ");");
        return stringBuffer.toString();
    }

    public String BuildSQLForDelete(BaseEntity entity, String basisName) {
        Class<? extends BaseEntity> clazz = entity.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DELETE FROM " + correctTableName(clazz.getSimpleName()));
        StringBuffer where = new StringBuffer();
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            try {
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object objValue = field.get(entity);
                    String fieldName = field.getName();
                    if (fieldName == basisName) {
                        where.append("String".equals(field.getType().getSimpleName()) ? " WHERE " + fieldName + " = '" + objValue + "';" : " WHERE " + fieldName + " = " + objValue + ";");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.append(where).toString();
    }

    public String BuildSQLForUpdate(BaseEntity entity, String basisName) {
        Class<? extends BaseEntity> clazz = entity.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UPDATE " + correctTableName(clazz.getSimpleName()) + " SET ");
        StringBuffer setValue = new StringBuffer();
        StringBuffer where = new StringBuffer();
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            try {
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object objValue = field.get(entity);
                    String fieldName = field.getName();
                    String fieldType = field.getType().getSimpleName();
                    if (objValue != null && fieldName != basisName) {
                        setValue.append("String".equals(fieldType) ? fieldName + " = '" + objValue + "' ," : " " + fieldName + " = " + objValue + " ,");
                    } else if (fieldName == basisName) {
                        where.append("String".equals(fieldType) ? "WHERE " + fieldName + " = '" + objValue + "';" : "WHERE " + fieldName + " = " + objValue + ";");
                    }
                }
                if (setValue != null) {
                    setValue.deleteCharAt(setValue.length() - 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.append(setValue).append(where).toString();
    }

    public String BuildSQLForQueryList(BaseEntity entity, Integer begin, Integer end) {
        Class<? extends BaseEntity> clazz = entity.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SELECT * FROM " + correctTableName(clazz.getSimpleName()) + " WHERE 1=1 ");
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    Object obj = field.get(entity);
                    if (obj != null) {
                        stringBuffer.append("String".equals(field.getType().getSimpleName()) ? " AND " + field.getName() + " like '%" + obj + "%'" : " AND " + field.getName() + " = " + obj);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuffer.append(" LIMIT " + begin + " , " + end + ";").toString();
    }

//    public static void main(String[] args) throws IllegalAccessException {
//        BuildSQLUtils buildSQLUtils = new BuildSQLUtils();
//        MemberEntity member = new MemberEntity();
//        //   member.setId(1);
//        member.setAccount("account");
//        member.setPassword("password");
//        System.out.println(buildSQLUtils.BuildSQLForInsert(member));
//    }

    public String correctTableName(String entityName) {
        if (entityName.compareTo("Entity") > 0) {
            entityName = entityName.replaceAll("Entity", "");
        }
        return entityName;
    }


}
