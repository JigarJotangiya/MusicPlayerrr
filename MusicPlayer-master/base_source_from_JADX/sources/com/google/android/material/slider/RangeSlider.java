package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.google.android.material.internal.C6093m;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;

public class RangeSlider extends BaseSlider<RangeSlider, Object, Object> {

    /* renamed from: k0 */
    private float f28804k0;

    /* renamed from: l0 */
    private int f28805l0;

    static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new C6159a();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f28806g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f28807h;

        /* renamed from: com.google.android.material.slider.RangeSlider$RangeSliderState$a */
        static class C6159a implements Parcelable.Creator<RangeSliderState> {
            C6159a() {
            }

            /* renamed from: a */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            /* renamed from: b */
            public RangeSliderState[] newArray(int i) {
                return new RangeSliderState[i];
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f28806g);
            parcel.writeInt(this.f28807h);
        }

        RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f28806g = parcel.readFloat();
            this.f28807h = parcel.readInt();
        }
    }

    public RangeSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: n0 */
    private static List<Float> m36922n0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    public float getMinSeparation() {
        return this.f28804k0;
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    public List<Float> getValues() {
        return super.getValues();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f28804k0 = rangeSliderState.f28806g;
        int d = rangeSliderState.f28807h;
        this.f28805l0 = d;
        setSeparationUnit(d);
    }

    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        float unused = rangeSliderState.f28806g = this.f28804k0;
        int unused2 = rangeSliderState.f28807h = this.f28805l0;
        return rangeSliderState;
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
        super.setHaloRadius(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i) {
        super.setHaloRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(C6163c cVar) {
        super.setLabelFormatter(cVar);
    }

    public void setMinSeparation(float f) {
        this.f28804k0 = f;
        this.f28805l0 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f28804k0 = f;
        this.f28805l0 = 1;
        setSeparationUnit(1);
    }

    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i) {
        super.setThumbElevationResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
        super.setThumbRadius(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i) {
        super.setThumbRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i) {
        super.setThumbStrokeColorResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i) {
        super.setThumbStrokeWidthResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackHeight(int i) {
        super.setTrackHeight(i);
    }

    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    public void setValues(Float... fArr) {
        super.setValues(fArr);
    }

    public RangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.sliderStyle);
    }

    public void setValues(List<Float> list) {
        super.setValues(list);
    }

    public RangeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.RangeSlider, i, BaseSlider.f28738j0, new int[0]);
        int i2 = C7500l.RangeSlider_values;
        if (h.hasValue(i2)) {
            setValues(m36922n0(h.getResources().obtainTypedArray(h.getResourceId(i2, 0))));
        }
        this.f28804k0 = h.getDimension(C7500l.RangeSlider_minSeparation, 0.0f);
        h.recycle();
    }
}
