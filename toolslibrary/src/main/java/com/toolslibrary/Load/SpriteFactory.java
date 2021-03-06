package com.toolslibrary.Load;

import com.toolslibrary.Load.sprite.Sprite;
import com.toolslibrary.Load.style.ChasingDots;
import com.toolslibrary.Load.style.Circle;
import com.toolslibrary.Load.style.CubeGrid;
import com.toolslibrary.Load.style.DoubleBounce;
import com.toolslibrary.Load.style.FadingCircle;
import com.toolslibrary.Load.style.FoldingCube;
import com.toolslibrary.Load.style.MultiplePulse;
import com.toolslibrary.Load.style.MultiplePulseRing;
import com.toolslibrary.Load.style.Pulse;
import com.toolslibrary.Load.style.PulseRing;
import com.toolslibrary.Load.style.RotatingCircle;
import com.toolslibrary.Load.style.RotatingPlane;
import com.toolslibrary.Load.style.ThreeBounce;
import com.toolslibrary.Load.style.WanderingCubes;
import com.toolslibrary.Load.style.Wave;

/**
 * Created by ybq.
 */
public class SpriteFactory {

    public static Sprite create(Style style) {
        Sprite sprite = null;
        switch (style) {
            case ROTATING_PLANE:
                sprite = new RotatingPlane();
                break;
            case DOUBLE_BOUNCE:
                sprite = new DoubleBounce();
                break;
            case WAVE:
                sprite = new Wave();
                break;
            case WANDERING_CUBES:
                sprite = new WanderingCubes();
                break;
            case PULSE:
                sprite = new Pulse();
                break;
            case CHASING_DOTS:
                sprite = new ChasingDots();
                break;
            case THREE_BOUNCE:
                sprite = new ThreeBounce();
                break;
            case CIRCLE:
                sprite = new Circle();
                break;
            case CUBE_GRID:
                sprite = new CubeGrid();
                break;
            case FADING_CIRCLE:
                sprite = new FadingCircle();
                break;
            case FOLDING_CUBE:
                sprite = new FoldingCube();
                break;
            case ROTATING_CIRCLE:
                sprite = new RotatingCircle();
                break;
            case MULTIPLE_PULSE:
                sprite = new MultiplePulse();
                break;
            case PULSE_RING:
                sprite = new PulseRing();
                break;
            case MULTIPLE_PULSE_RING:
                sprite = new MultiplePulseRing();
                break;
            default:
                break;
        }
        return sprite;
    }
}
