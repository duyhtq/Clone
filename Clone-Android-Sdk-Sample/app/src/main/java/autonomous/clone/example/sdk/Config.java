package autonomous.clone.example.sdk;

/**
 * Created by binhpro on 5/4/17.
 */

public class Config {
    // FireBase  User//
    public static  String FBASE_EMAIL = "clone-sample@autonomous.nyc";
    public static  String FBASE_PASSWORD = "012345";

    //====Move COMMAND=====//
    public static String STOP= "STOP";
    public static String FORWARD= "UP";
    public static String BACKWARD= "DOWN";
    public static String LEFT= "LEFT";
    public static String RIGHT= "RIGHT";

    // Opentok Video App_KEY
    public static String API_KEY ="45837512";

    //Clone-Base ProductID
    public static String PRODUCT_ID ="YOUR_PRODUCT_ID";
    //To create new Session & Token, Please launch clone-api flask app.
    // call api /session/create
    public static String SESSION_ID ="1_MX40NTgzNzUxMn5-MTQ5NDA5NzQyMjA3MX4rQU9GT0EwTjEyR1lFM1JlbTFqc25PZGl-fg";
    public static String TOKEN="T1==cGFydG5lcl9pZD00NTgzNzUxMiZzaWc9MjMzMGIxMTUxNDI3Y2ZjZDJjMGJlOTYzYmIzNzQ2YjJkZjNkYThhOTpub25jZT03MzY0NzUmY29ubmVjdGlvbl9kYXRhPU5vbmUmY3JlYXRlX3RpbWU9MTQ5NDA5NzQ4MiZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNDk0MTgzODgyJnNlc3Npb25faWQ9MV9NWDQwTlRnek56VXhNbjUtTVRRNU5EQTVOelF5TWpBM01YNHJRVTlHVDBFd1RqRXlSMWxGTTFKbGJURnFjMjVQWkdsLWZn";
    public static boolean SUBSCRIBE_TO_SELF =false;


}