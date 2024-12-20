package Bridge;

import Enum.Material;
import Human.ZeroException;


public class Bridge {
    private final Material material;
    private final int length;
    public boolean isBuilt;

    public Bridge(int length, Material material) {
        this.length = length;
        this.material = material;
        isBuilt = false;
        setLength(length);

    }
    public void setLength(int length) throws ZeroException{
        if (length < 0){
            throw new ZeroException("Длина не может быть отрицательной.");
        }
    }

    public int getLength() {
        return this.length;
    }

    public Material getMaterial() {
        return this.material;
    }

    public static int calcLength(int riversWidth, int ravinesWidth) {
        return ravinesWidth + riversWidth + 10;
    }

    @Override
    public String toString() {
        return "Мост";
    }

    @Override
    public int hashCode() {
        return length * 90 + material.hashCode() * 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bridge bridge)) {
            return false;
        }
        return length == bridge.getLength()
                && (material == bridge.getMaterial());
    }

}
