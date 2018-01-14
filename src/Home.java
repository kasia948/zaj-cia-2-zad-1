public class Home {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();
        carpet1.size="big";
        carpet1.colour="red";
        carpet1.shape="square";

        Carpet carpet2=new Carpet();
        carpet2.size="small";
        carpet2.colour="black";
        carpet2.shape="round";

        System.out.println("I have two carpets in my house, one is "+carpet1.size+", "+carpet1.colour+" and "+carpet1.shape+
                ". Another one is "+carpet2.size+", "+carpet2.colour+" and "+carpet2.shape+".");
    }
}
