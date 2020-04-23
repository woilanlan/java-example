package top.woilanlan.innerclasses;

/**
 * Parcel6
 * TrackingSlip类被嵌入在if语句的作用域内，在作用域之外不可用
 */
public class Parcel6 {

    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        //在这儿就不能使用，超出范围
        //TrackingSlip ts = new TrackingSlip("x");
    }
    public void track(){
        internalTracking(true);
    }
    public static void show() {
        Parcel6 p = new Parcel6();
        p.track();
    }
}