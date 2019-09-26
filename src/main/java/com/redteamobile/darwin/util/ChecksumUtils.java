package com.redteamobile.darwin.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ChecksumUtils {
    private static final Logger LOG = LoggerFactory.getLogger(ChecksumUtils.class);

    public static String MD5(String input) {
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            LOG.error("No such algorithm MD5, but this should not happen !!");
        } catch (UnsupportedEncodingException e) {
            LOG.error("Unsupported encoding is used, but this should not happend !!");
        }

        byte byteData[] = md.digest();
        return DatatypeConverter.printHexBinary(byteData).toLowerCase();
    }

    public static String SHA1(String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA1");
            md.update(input.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
        } catch (UnsupportedEncodingException e) {
        }

        byte byteData[] = md.digest();
        return DatatypeConverter.printHexBinary(byteData).toLowerCase();
    }

    public static String SHA256(String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
        } catch (UnsupportedEncodingException e) {
        }

        byte byteData[] = md.digest();
        return DatatypeConverter.printHexBinary(byteData).toLowerCase();
    }
}

