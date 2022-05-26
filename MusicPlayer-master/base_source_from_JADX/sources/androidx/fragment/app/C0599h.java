package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p082e.p136n.C4095c;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentLayoutInflaterFactory */
class C0599h implements LayoutInflater.Factory2 {

    /* renamed from: g */
    private final C0602j f3065g;

    C0599h(C0602j jVar) {
        this.f3065g = jVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3065g);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4095c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C4095c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C4095c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C4095c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0597f.m3792b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3065g.mo3936X(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3065g.mo3938Y(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3065g.mo3936X(id);
        }
        if (C0602j.m3853r0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f3065g.mo3953g0().mo3881a(context.getClassLoader(), attributeValue);
            fragment.f2948s = true;
            fragment.f2909B = resourceId != 0 ? resourceId : id;
            fragment.f2910C = id;
            fragment.f2911D = string;
            fragment.f2949t = true;
            C0602j jVar = this.f3065g;
            fragment.f2953x = jVar;
            C0598g<?> gVar = jVar.f3090o;
            fragment.f2954y = gVar;
            fragment.mo3595H1(gVar.mo3883e(), attributeSet, fragment.f2937h);
            this.f3065g.mo3947d(fragment);
            this.f3065g.mo3906B0(fragment);
        } else if (!fragment.f2949t) {
            fragment.f2949t = true;
            C0598g<?> gVar2 = this.f3065g.f3090o;
            fragment.f2954y = gVar2;
            fragment.mo3595H1(gVar2.mo3883e(), attributeSet, fragment.f2937h);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        C0602j jVar2 = this.f3065g;
        if (jVar2.f3089n >= 1 || !fragment.f2948s) {
            jVar2.mo3906B0(fragment);
        } else {
            jVar2.mo3907C0(fragment, 1);
        }
        View view2 = fragment.f2920M;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f2920M.getTag() == null) {
                fragment.f2920M.setTag(string);
            }
            return fragment.f2920M;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
