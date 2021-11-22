//package com.example.rentalz;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.simple.parser.*;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LanguageDataUtils {
//    public static List<Address> getLanguages( ) {
//        JSONParser jsonParser = new JSONParser();
//        List<Address> lstAddress = new ArrayList<>();
//        try(FileReader reader = new FileReader("conf/house-re-default-rtdb-export.json")) {
//            Object obj = jsonParser.parse(reader);
//            JSONArray employeeList = (JSONArray) obj;
//            for(int i = 0; i< 63; i++){
//                Address add = parseEmployeeObject((JSONObject) employeeList.get(i));
//                lstAddress.add(add);
//            }
//        }catch (Exception ex){
//
//        }
//return lstAddress;
//    }
//    private static Address parseEmployeeObject(JSONObject employee) throws JSONException {
//        //Get employee object within list
//        JSONObject employeeObject = (JSONObject) employee.get("data");
//
//        //Get employee first name
//        String slug = (String) employeeObject.get("slug");
//        //Get employee first name
//        String name = (String) employeeObject.get("name");
//        //Get employee last name
//        String type = (String) employeeObject.get("type");
//
//        //Get employee website name
//        String name_with_type = (String) employeeObject.get("name_with_type");
//
//        //Get employee website name
//        String code = (String) employeeObject.get("code");
//        return new Address(code,name, name_with_type, slug, type);
//    }
//}
