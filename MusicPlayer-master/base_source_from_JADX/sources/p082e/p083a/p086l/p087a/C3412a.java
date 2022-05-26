package p082e.p083a.p086l.p087a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0320w;
import androidx.core.content.p003d.C0533g;
import androidx.core.graphics.drawable.C0535b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p083a.p086l.p087a.C3420b;
import p082e.p083a.p086l.p087a.C3426e;
import p082e.p083a.p088m.C3429b;
import p082e.p098e.C3470d;
import p082e.p098e.C3479h;
import p082e.p154x.p155a.p156a.C4237c;
import p082e.p154x.p155a.p156a.C4247i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C3412a extends C3426e implements C0535b {

    /* renamed from: u */
    private C3415c f10817u;

    /* renamed from: v */
    private C3419g f10818v;

    /* renamed from: w */
    private int f10819w;

    /* renamed from: x */
    private int f10820x;

    /* renamed from: y */
    private boolean f10821y;

    /* renamed from: e.a.l.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3414b extends C3419g {

        /* renamed from: a */
        private final Animatable f10822a;

        C3414b(Animatable animatable) {
            super();
            this.f10822a = animatable;
        }

        /* renamed from: c */
        public void mo12031c() {
            this.f10822a.start();
        }

        /* renamed from: d */
        public void mo12032d() {
            this.f10822a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C3415c extends C3426e.C3427a {

        /* renamed from: K */
        C3470d<Long> f10823K;

        /* renamed from: L */
        C3479h<Integer> f10824L;

        C3415c(C3415c cVar, C3412a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f10823K = cVar.f10823K;
                this.f10824L = cVar.f10824L;
                return;
            }
            this.f10823K = new C3470d<>();
            this.f10824L = new C3479h<>();
        }

        /* renamed from: D */
        private static long m14561D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo12033B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo12155z(iArr, drawable);
            this.f10824L.mo12414k(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo12034C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo12088a(drawable);
            long D = m14561D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f10823K.mo12298a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f10823K.mo12298a(m14561D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo12035E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f10824L.mo12410g(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo12036F(int[] iArr) {
            int A = super.mo12154A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo12154A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo12037G(int i, int i2) {
            return (int) this.f10823K.mo12305i(m14561D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo12038H(int i, int i2) {
            return (this.f10823K.mo12305i(m14561D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo12039I(int i, int i2) {
            return (this.f10823K.mo12305i(m14561D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C3412a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo12042r() {
            this.f10823K = this.f10823K.clone();
            this.f10824L = this.f10824L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C3412a(this, resources);
        }
    }

    /* renamed from: e.a.l.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3416d extends C3419g {

        /* renamed from: a */
        private final C4237c f10825a;

        C3416d(C4237c cVar) {
            super();
            this.f10825a = cVar;
        }

        /* renamed from: c */
        public void mo12031c() {
            this.f10825a.start();
        }

        /* renamed from: d */
        public void mo12032d() {
            this.f10825a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3417e extends C3419g {

        /* renamed from: a */
        private final ObjectAnimator f10826a;

        /* renamed from: b */
        private final boolean f10827b;

        C3417e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C3418f fVar = new C3418f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo12045a());
            ofInt.setInterpolator(fVar);
            this.f10827b = z2;
            this.f10826a = ofInt;
        }

        /* renamed from: a */
        public boolean mo12043a() {
            return this.f10827b;
        }

        /* renamed from: b */
        public void mo12044b() {
            this.f10826a.reverse();
        }

        /* renamed from: c */
        public void mo12031c() {
            this.f10826a.start();
        }

        /* renamed from: d */
        public void mo12032d() {
            this.f10826a.cancel();
        }
    }

    /* renamed from: e.a.l.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C3418f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f10828a;

        /* renamed from: b */
        private int f10829b;

        /* renamed from: c */
        private int f10830c;

        C3418f(AnimationDrawable animationDrawable, boolean z) {
            mo12046b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo12045a() {
            return this.f10830c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo12046b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f10829b = numberOfFrames;
            int[] iArr = this.f10828a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f10828a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f10828a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f10830c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f10830c)) + 0.5f);
            int i2 = this.f10829b;
            int[] iArr = this.f10828a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f10830c) : 0.0f);
        }
    }

    /* renamed from: e.a.l.a.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C3419g {
        private C3419g() {
        }

        /* renamed from: a */
        public boolean mo12043a() {
            return false;
        }

        /* renamed from: b */
        public void mo12044b() {
        }

        /* renamed from: c */
        public abstract void mo12031c();

        /* renamed from: d */
        public abstract void mo12032d();
    }

    static {
        Class<C3412a> cls = C3412a.class;
    }

    public C3412a() {
        this((C3415c) null, (Resources) null);
    }

    /* renamed from: m */
    public static C3412a m14547m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3412a aVar = new C3412a();
            aVar.mo12028n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m14548o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m14550q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m14551r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m14549p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m14550q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C3429b.AnimatedStateListDrawableItem);
        int resourceId = k.getResourceId(C3429b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = k.getResourceId(C3429b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? C0320w.m1882h().mo2147j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo12153k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j = C4247i.m18661c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.f10817u.mo12033B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m14551r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C3429b.AnimatedStateListDrawableTransition);
        int resourceId = k.getResourceId(C3429b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = k.getResourceId(C3429b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = k.getResourceId(C3429b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? C0320w.m1882h().mo2147j(context, resourceId3) : null;
        boolean z = k.getBoolean(C3429b.AnimatedStateListDrawableTransition_android_reversible, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = C4237c.m18628a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f10817u.mo12034C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m14552s(int i) {
        int i2;
        int G;
        C3419g gVar;
        C3419g gVar2 = this.f10818v;
        if (gVar2 == null) {
            i2 = mo12050c();
        } else if (i == this.f10819w) {
            return true;
        } else {
            if (i != this.f10820x || !gVar2.mo12043a()) {
                i2 = this.f10819w;
                gVar2.mo12032d();
            } else {
                gVar2.mo12044b();
                this.f10819w = this.f10820x;
                this.f10820x = i;
                return true;
            }
        }
        this.f10818v = null;
        this.f10820x = -1;
        this.f10819w = -1;
        C3415c cVar = this.f10817u;
        int E = cVar.mo12035E(i2);
        int E2 = cVar.mo12035E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo12037G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo12039I(E, E2);
        mo12053g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C3417e((AnimationDrawable) current, cVar.mo12038H(E, E2), I);
        } else if (current instanceof C4237c) {
            gVar = new C3416d((C4237c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C3414b((Animatable) current);
            }
            return false;
        }
        gVar.mo12031c();
        this.f10818v = gVar;
        this.f10820x = i2;
        this.f10819w = i;
        return true;
    }

    /* renamed from: t */
    private void m14553t(TypedArray typedArray) {
        C3415c cVar = this.f10817u;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f10857d |= typedArray.getChangingConfigurations();
        }
        cVar.mo12110x(typedArray.getBoolean(C3429b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f10862i));
        cVar.mo12106t(typedArray.getBoolean(C3429b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f10865l));
        cVar.mo12107u(typedArray.getInt(C3429b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f10845A));
        cVar.mo12108v(typedArray.getInt(C3429b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f10846B));
        setDither(typedArray.getBoolean(C3429b.AnimatedStateListDrawableCompat_android_dither, cVar.f10877x));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12022h(C3420b.C3423c cVar) {
        super.mo12022h(cVar);
        if (cVar instanceof C3415c) {
            this.f10817u = (C3415c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3419g gVar = this.f10818v;
        if (gVar != null) {
            gVar.mo12032d();
            this.f10818v = null;
            mo12053g(this.f10819w);
            this.f10819w = -1;
            this.f10820x = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C3415c mo12024j() {
        return new C3415c(this.f10817u, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f10821y) {
            super.mutate();
            if (this == this) {
                this.f10817u.mo12042r();
                this.f10821y = true;
            }
        }
        return this;
    }

    /* renamed from: n */
    public void mo12028n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C3429b.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(C3429b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m14553t(k);
        mo12066i(resources);
        k.recycle();
        m14548o(context, resources, xmlPullParser, attributeSet, theme);
        m14549p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f10817u.mo12036F(iArr);
        boolean z = F != mo12050c() && (m14552s(F) || mo12053g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C3419g gVar = this.f10818v;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo12031c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C3412a(C3415c cVar, Resources resources) {
        super((C3426e.C3427a) null);
        this.f10819w = -1;
        this.f10820x = -1;
        mo12022h(new C3415c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
