package edu.wctc;

import java.io.Serializable;

public interface Paintable extends Serializable {
    double PREMIUM_PAINT_COST_PER_GALLON = 65.99;

    double STANDARD_PAINT_COST_PER_GALLON = 25.99;

    // Cost to paint using premium paint?

    default public double getPremiumCost(){
        return PREMIUM_PAINT_COST_PER_GALLON;
    }

    // Cost to paint using standard paint?

    default public double getStandardCost(){
        return STANDARD_PAINT_COST_PER_GALLON;
    }
}
