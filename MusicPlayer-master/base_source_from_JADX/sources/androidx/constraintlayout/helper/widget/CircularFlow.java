package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {

    /* renamed from: B */
    private static int f1577B;

    /* renamed from: C */
    private static float f1578C;

    /* renamed from: A */
    private Integer f1579A;

    /* renamed from: r */
    ConstraintLayout f1580r;

    /* renamed from: s */
    int f1581s;

    /* renamed from: t */
    private float[] f1582t;

    /* renamed from: u */
    private int[] f1583u;

    /* renamed from: v */
    private int f1584v;

    /* renamed from: w */
    private int f1585w;

    /* renamed from: x */
    private String f1586x;

    /* renamed from: y */
    private String f1587y;

    /* renamed from: z */
    private Float f1588z;

    public CircularFlow(Context context) {
        super(context);
    }

    /* renamed from: A */
    private void m2085A() {
        this.f1580r = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f2156h; i++) {
            View i2 = this.f1580r.mo2873i(this.f2155g[i]);
            if (i2 != null) {
                int i3 = f1577B;
                float f = f1578C;
                int[] iArr = this.f1583u;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.f1579A;
                    if (num == null || num.intValue() == -1) {
                        String valueOf = String.valueOf(this.f2163o.get(Integer.valueOf(i2.getId())));
                        Log.e("CircularFlow", valueOf.length() != 0 ? "Added radius to view with id: ".concat(valueOf) : new String("Added radius to view with id: "));
                    } else {
                        this.f1584v++;
                        if (this.f1583u == null) {
                            this.f1583u = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f1583u = radius;
                        radius[this.f1584v - 1] = i3;
                    }
                } else {
                    i3 = iArr[i];
                }
                float[] fArr = this.f1582t;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.f1588z;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        String valueOf2 = String.valueOf(this.f2163o.get(Integer.valueOf(i2.getId())));
                        Log.e("CircularFlow", valueOf2.length() != 0 ? "Added angle to view with id: ".concat(valueOf2) : new String("Added angle to view with id: "));
                    } else {
                        this.f1585w++;
                        if (this.f1582t == null) {
                            this.f1582t = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f1582t = angles;
                        angles[this.f1585w - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) i2.getLayoutParams();
                layoutParams.f2242q = f;
                layoutParams.f2238o = this.f1581s;
                layoutParams.f2240p = i3;
                i2.setLayoutParams(layoutParams);
            }
        }
        mo2848h();
    }

    private void setAngles(String str) {
        if (str != null) {
            int i = 0;
            this.f1585w = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2086y(str.substring(i).trim());
                    return;
                } else {
                    m2086y(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i = 0;
            this.f1584v = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2087z(str.substring(i).trim());
                    return;
                } else {
                    m2087z(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: y */
    private void m2086y(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f2157i != null && (fArr = this.f1582t) != null) {
            if (this.f1585w + 1 > fArr.length) {
                this.f1582t = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f1582t[this.f1585w] = (float) Integer.parseInt(str);
            this.f1585w++;
        }
    }

    /* renamed from: z */
    private void m2087z(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f2157i != null && (iArr = this.f1583u) != null) {
            if (this.f1584v + 1 > iArr.length) {
                this.f1583u = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f1583u[this.f1584v] = (int) (((float) Integer.parseInt(str)) * this.f2157i.getResources().getDisplayMetrics().density);
            this.f1584v++;
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f1582t, this.f1585w);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f1583u, this.f1584v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f1581s = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C0439f.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1586x = string;
                    setAngles(string);
                } else if (index == C0439f.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1587y = string2;
                    setRadius(string2);
                } else if (index == C0439f.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f1578C));
                    this.f1588z = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == C0439f.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f1577B));
                    this.f1579A = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1586x;
        if (str != null) {
            this.f1582t = new float[1];
            setAngles(str);
        }
        String str2 = this.f1587y;
        if (str2 != null) {
            this.f1583u = new int[1];
            setRadius(str2);
        }
        Float f = this.f1588z;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f1579A;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m2085A();
    }

    public void setDefaultAngle(float f) {
        f1578C = f;
    }

    public void setDefaultRadius(int i) {
        f1577B = i;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
