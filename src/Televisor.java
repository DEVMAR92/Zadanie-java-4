class Televisor {
    private String status = "off";

    void turnOn(){
        status = "on";
    }
    void turnOff(){
        status = "off";
    }
    void showStatus(){
        System.out.println(status);
    }
}
