package com.stepstone.stepper.internal.type;

import android.graphics.drawable.Drawable;

import com.stepstone.stepper.StepperLayout;

import java.util.List;

/**
 * Created by yccheok on 29/6/2017.
 */

public class NoneStepperType extends AbstractStepperType {
    public NoneStepperType(StepperLayout stepperLayout) {
        super(stepperLayout);
    }

    @Override
    public void onSetTabIcon(int newStepPosition, Drawable color) {

    }

    @Override
    public void onStepSelected(int newStepPosition, boolean userTriggeredChange, List<Drawable> colors) {
    }
}
