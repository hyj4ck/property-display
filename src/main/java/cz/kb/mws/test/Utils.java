package cz.kb.mws.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hyjack on 18.01.17.
 */
public class Utils {

//    public static void main(String[] args) {
//        String propFilePath = "/Users/hyjack/devel/repo/propDisplay/testData/test.properties";
//
//        loadProps(propFilePath);
//
//    }

    public static Map<String, String> loadProps(String path) {
        Properties props = new Properties();
        File propFile = new File(path);
        HashMap result = new HashMap();

        try {
            props.load(new FileInputStream(propFile));

            Iterator it = props.keySet().iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                result.put(key, props.getProperty(key));
//                System.out.println("key: " + key + ", value: " + props.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }
}
