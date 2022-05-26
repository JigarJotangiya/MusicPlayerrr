package p159f.p243f.p245b.p304b.p305m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p082e.p098e.C3478g;

/* renamed from: f.f.b.b.m.h */
/* compiled from: MotionSpec */
public class C7508h {

    /* renamed from: a */
    private final C3478g<String, C7509i> f32712a = new C3478g<>();

    /* renamed from: b */
    private final C3478g<String, PropertyValuesHolder[]> f32713b = new C3478g<>();

    /* renamed from: a */
    private static void m41953a(C7508h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo28390l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo28391m(objectAnimator.getPropertyName(), C7509i.m41966b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    private PropertyValuesHolder[] m41954b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: c */
    public static C7508h m41955c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m41956d(context, resourceId);
    }

    /* renamed from: d */
    public static C7508h m41956d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m41957e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m41957e(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: e */
    private static C7508h m41957e(List<Animator> list) {
        C7508h hVar = new C7508h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m41953a(hVar, list.get(i));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7508h)) {
            return false;
        }
        return this.f32712a.equals(((C7508h) obj).f32712a);
    }

    /* renamed from: f */
    public <T> ObjectAnimator mo28383f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo28384g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo28385h(str).mo28393a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] mo28384g(String str) {
        if (mo28388j(str)) {
            return m41954b(this.f32713b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C7509i mo28385h(String str) {
        if (mo28389k(str)) {
            return this.f32712a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f32712a.hashCode();
    }

    /* renamed from: i */
    public long mo28387i() {
        int size = this.f32712a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C7509i m = this.f32712a.mo12397m(i);
            j = Math.max(j, m.mo28394c() + m.mo28395d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo28388j(String str) {
        return this.f32713b.get(str) != null;
    }

    /* renamed from: k */
    public boolean mo28389k(String str) {
        return this.f32712a.get(str) != null;
    }

    /* renamed from: l */
    public void mo28390l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f32713b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo28391m(String str, C7509i iVar) {
        this.f32712a.put(str, iVar);
    }

    public String toString() {
        return 10 + C7508h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f32712a + "}\n";
    }
}
