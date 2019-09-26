package com.redteamobile.darwin.util;

import org.joda.time.DateTime;

import java.util.Date;

public class EqualsUtils {
    // Protect constructor since it is a static only class
    protected EqualsUtils() {}

    public static boolean stringEquals(final String source, final String target) {
        if (source == target) {
            return true;
        }
        if (source == null && target == null) {
            return true;
        }
        if (source != null && target != null) {
            if (source.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean dateEquals(final Date source, final Date target) {
        if (source == target) {
            return true;
        }
        if (source == null && target == null) {
            return true;
        }
        if (source != null && target != null) {
            if (source.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean dateTimeEquals(final DateTime source, final DateTime target) {
        if (source == target) {
            return true;
        }
        if (source == null && target == null) {
            return true;
        }
        if (source != null && target != null) {
            if (source.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean integerEquals(final Integer source, final Integer target) {
        if (source == target) {
            return true;
        }
        if (source == null && target == null) {
            return true;
        }
        if (source != null && target != null) {
            if (source.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean longEquals(final Long source, final Long target) {
        if (source == target) {
            return true;
        }
        if (source == null && target == null) {
            return true;
        }
        if (source != null && target != null) {
            if (source.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
