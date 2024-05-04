public class BT2lab4 {
    public class Triangle {
        private float width = 0.0f;
        private float height = 0.0f;
    
        public Triangle() {
        }
    
        public Triangle(float width, float height) {
            this.width = width;
            this.height = height;
        }
    
        public float getWidth() {
            return this.width;
        }
    
        public float getHeight() {
            return this.height;
        }
    
        public void setWidth(float width) {
            this.width = width;
        }
    
        public void setHeight(float height) {
            this.height = height;
        }
    
        @Override
        public String toString() {
            return "Triangle[width=" + this.width + ", height=" + this.height + "]";
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new BT2lab4().new Triangle();
    
        triangle.setWidth(5.0f);
        triangle.setHeight(10.0f);
    
        System.out.println("Width: " + triangle.getWidth());
        System.out.println("Height: " + triangle.getHeight());
    
        System.out.println(triangle.toString());
    }
    
}
