package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.C6066d;
import com.google.android.material.internal.C6093m;
import com.google.android.material.theme.p249a.C6260a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ListPopupWindow f28991j;

    /* renamed from: k */
    private final AccessibilityManager f28992k;

    /* renamed from: l */
    private final Rect f28993l;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    class C6215a implements AdapterView.OnItemClickListener {
        C6215a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MaterialAutoCompleteTextView.this.m37169e(i < 0 ? MaterialAutoCompleteTextView.this.f28991j.mo1636v() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f28991j.mo1639y();
                    i = MaterialAutoCompleteTextView.this.f28991j.mo1638x();
                    j = MaterialAutoCompleteTextView.this.f28991j.mo1637w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f28991j.mo845j(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f28991j.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private TextInputLayout m37167c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m37168d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = m37167c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f28991j.mo1638x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable i3 = this.f28991j.mo1630i();
        if (i3 != null) {
            i3.getPadding(this.f28993l);
            Rect rect = this.f28993l;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m37169e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter((ListAdapter) null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout c = m37167c();
        if (c == null || !c.mo24857O()) {
            return super.getHint();
        }
        return c.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = m37167c();
        if (c != null && c.mo24857O() && super.getHint() == null && C6066d.m36468a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m37168d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f28991j.mo1496p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f28992k;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f28991j.mo840b();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C6260a.m37386c(context, attributeSet, i, 0), attributeSet, i);
        this.f28993l = new Rect();
        Context context2 = getContext();
        TypedArray h = C6093m.m36563h(context2, attributeSet, C7500l.MaterialAutoCompleteTextView, i, C7499k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C7500l.MaterialAutoCompleteTextView_android_inputType;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f28992k = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f28991j = listPopupWindow;
        listPopupWindow.mo1620J(true);
        listPopupWindow.mo1614D(this);
        listPopupWindow.mo1619I(2);
        listPopupWindow.mo1496p(getAdapter());
        listPopupWindow.mo1622L(new C6215a());
        h.recycle();
    }
}
