/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        if (getLength() != null) {
            hashCode += getLength().hashCode();
        }

        if (getWidth() != null) {
            hashCode += getWidth().hashCode();
        }

        if (getColor() != null) {
            hashCode += getColor().hashCode();
        }

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj instanceof Rectangle) {
            Rectangle objRectangle = (Rectangle) obj;

            if ((getColor() == objRectangle.getColor() && getColor() == null)
                    && (getLength() == objRectangle.getLength() && getLength() == null)
                    && (getWidth() == objRectangle.getWidth() && getWidth() == null)
                    && (hashCode() == objRectangle.hashCode())) {
                return true;
            } else {
                if (getColor().equals(objRectangle.getColor())
                        && getLength().equals(objRectangle.getLength())
                        && getWidth().equals(objRectangle.getWidth())
                        && (hashCode() == objRectangle.hashCode())) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
