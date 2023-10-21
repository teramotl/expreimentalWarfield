public class GearBox {
    /**
     * 0 - neutral
     * -1 - szadniy
     * 1-6 skorost
     */
    private int maxGear = 6;
    private int minGear = 1;
    private int gear = 0;
    public void shiftUp() {
        gear = gear < maxGear ? gear +1 : gear;
    }
    public void shiftDown() {
        gear = gear > minGear ? gear -1 : gear;
    }
    public void switchGear() {
        gear = (gear > 1) ? gear : -1;
    }
    public void switchNeutral() {
        gear = 0;
    }
    public int getCurrentGear() {
        return gear;
    }
}

/*public static void main(String[] args) {
 GearBox gearBox = new GearBox();
 System.out.println(gearBox.getCurrentGear());

 }
 */