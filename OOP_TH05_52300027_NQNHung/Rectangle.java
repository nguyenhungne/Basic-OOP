public class Rectangle {
    private float _width;
    private float _height;

    Rectangle() {
        _width = 1.0f;
        _height = 1.0f;
    }

    Rectangle(float width, float height) {
        _width = width;
        _height = height;
    }

    public float getWidth() {
        return _width;
    }

    public float getHeight() {
        return _height;
    }

    public float getArea() {
        return _width * _height;
    }

    public float getPerimeter() {
        return 2 * (_width + _height);
    }

    public void setWidth(float _width) {
        this._width = _width;
    }

    public void setHeight(float _height) {
        this._height = _height;
    }
}
