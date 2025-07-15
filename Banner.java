class Banner {
   
    static String message;
    static String color;
    static byte fontSize;
    static short width;
    static int height;
    static long id;
    static float opacity;
    static double price;
    static char symbol;
    static boolean isVisible;
    static String fontFamily;
    static int borderThickness;
    static boolean hasShadow;
    static float rotationAngle;
    static short printCount;

   

    public String getMessage() {
        return message;
    }
	public int getHeight(){
		return height;
	}

    public byte getFontSize() {
        return fontSize;
    }

    public boolean getIsVisible() {
        return isVisible;
    }
    public long getID(){
		return id;
	}
	public short getPrintCount(){
		return printCount;
	}
	
    public double getPrice() {
        return price;
    }

    public char getSymbol() {
        return symbol;
    }

    public float getOpacity() {
        return opacity;
    }
}
