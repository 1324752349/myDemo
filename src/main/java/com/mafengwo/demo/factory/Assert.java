package com.mafengwo.demo.factory;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Assert {

    public static class StringAssert {

        public static boolean isNotEmpty(String string) {

            return !StringUtils.isEmpty(string);
        }

        public static boolean isEmpty(String string) {

            return StringUtils.isEmpty(string);
        }

    }

    public static class MapAssert {

        public static boolean isEmpty(Map map) {

            if (map == null || map.size() == 0) {
                return true;
            }
            return false;
        }

        public static boolean isNotEmpty(Map map) {

            return !isEmpty(map);
        }

    }

    public static class ObjectAssert {

        public static boolean isNotNull(Object object) {

            return !Objects.isNull(object);
        }

        public static boolean isNull(Object object) {
            return Objects.isNull(object);
        }

    }

    public static class ListAssert {

        public static boolean isNotEmpty(List list) {

            return list != null && list.size() != 0;
        }

        public static boolean isEmpty(List list) {
            return !isNotEmpty(list);
        }

    }


}
