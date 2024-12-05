package Bridge;

import Enum.Material;
import Human.Human;

public class Bridge {
    private Material material;
    public int length;
    public boolean isBuilt;

    public Bridge(int length, Material material) {
        this.length = length;
        this.material = material;
        isBuilt = false;
    }

    public int getLength() {
        return this.length;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int calcLength(int riversWidth, int ravinesWidth) {
        int length = ravinesWidth+riversWidth+10;
        return length;
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
        Bridge bridge = (Bridge) obj;
        return length == bridge.getLength()
                &&  (material == bridge.getMaterial());
    }
}
