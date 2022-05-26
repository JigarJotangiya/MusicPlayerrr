package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.C6100s;
import java.util.Calendar;
import p082e.p109h.p118o.C3699e;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7494f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: g */
    private final Calendar f28123g;

    /* renamed from: h */
    private final boolean f28124h;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C5980a extends C3704a {
        C5980a(MaterialCalendarGridView materialCalendarGridView) {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13117e0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m35996a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo23752i());
        } else if (i == 130) {
            setSelection(getAdapter().mo23742b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private static int m35997c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m35998d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C6002g getAdapter() {
        return (C6002g) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C6002g b = getAdapter();
        DateSelector<?> dateSelector = b.f28186h;
        C5985b bVar = b.f28188j;
        Long c = b.getItem(b.mo23742b());
        Long c2 = b.getItem(b.mo23752i());
        for (C3699e next : dateSelector.mo23661c()) {
            F f = next.f11713a;
            if (f != null) {
                if (next.f11714b != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f11714b).longValue();
                    if (!m35998d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean h = C6100s.m36587h(this);
                        if (longValue < c.longValue()) {
                            i2 = b.mo23742b();
                            if (b.mo23745f(i2)) {
                                i = 0;
                            } else if (!h) {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f28123g.setTimeInMillis(longValue);
                            i2 = b.mo23741a(materialCalendarGridView.f28123g.get(5));
                            i = m35997c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo23752i(), getChildCount() - 1);
                            if (b.mo23746g(i4)) {
                                i3 = getWidth();
                            } else if (!h) {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f28123g.setTimeInMillis(longValue2);
                            i4 = b.mo23741a(materialCalendarGridView.f28123g.get(5));
                            i3 = m35997c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + bVar.f28140a.mo23721c();
                            int bottom = childAt.getBottom() - bVar.f28140a.mo23720b();
                            if (!h) {
                                i6 = numColumns > i2 ? 0 : i;
                                i5 = i4 > numColumns2 ? getWidth() : i3;
                            } else {
                                int i7 = i4 > numColumns2 ? 0 : i3;
                                i5 = numColumns > i2 ? getWidth() : i;
                                i6 = i7;
                            }
                            canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f28147h);
                            itemId++;
                            materialCalendarGridView = this;
                            b = b;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m35996a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo23742b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo23742b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f28124h) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo23742b()) {
            super.setSelection(getAdapter().mo23742b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28123g = C6011m.m36112k();
        if (C6001f.m36073i3(getContext())) {
            setNextFocusLeftId(C7494f.cancel_button);
            setNextFocusRightId(C7494f.confirm_button);
        }
        this.f28124h = C6001f.m36074j3(getContext());
        C3774v.m16217o0(this, new C5980a(this));
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C6002g) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C6002g.class.getCanonicalName()}));
        }
    }
}
