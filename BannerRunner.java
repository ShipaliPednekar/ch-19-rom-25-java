class BannerRunner {
    public static void main(String[] args) {
        Banner b = new Banner();

       
        b.color = "Blue";
        b.fontSize = 14;
        b.width = 250;
        b.height = 100;
        b.id = 123456789L;
        b.opacity = 0.85f;
        b.price = 499.99;
        b.symbol = '*';
        b.isVisible = true;
        b.fontFamily = "Arial";
        b.borderThickness = 2;
        b.hasShadow = true;
        b.rotationAngle = 15.5f;
        b.printCount = 5;

        
        System.out.println("Font Size : " + b.getFontSize());
        System.out.println("Visible   : " + b.getIsVisible());
        System.out.println("Price  : " + b.getPrice());
        System.out.println("Symbol Used : " + b.getSymbol());
        System.out.println("Opacity Level : " + b.getOpacity());
		System.out.println("Height : "  + b.getHeight());
		System.out.println("ID : "  + b.getID());
		System.out.println ("PrintCount : " + b.getPrintCount());
    }
}
