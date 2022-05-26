package p082e.p154x.p155a.p156a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0533g;
import androidx.core.graphics.drawable.C0534a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p098e.C3465a;

/* renamed from: e.x.a.a.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C4237c extends C4246h implements Animatable {

    /* renamed from: h */
    private C4239b f12637h;

    /* renamed from: i */
    private Context f12638i;

    /* renamed from: j */
    private ArgbEvaluator f12639j;

    /* renamed from: k */
    final Drawable.Callback f12640k;

    /* renamed from: e.x.a.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C4238a implements Drawable.Callback {
        C4238a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C4237c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C4237c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C4237c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.x.a.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C4239b extends Drawable.ConstantState {

        /* renamed from: a */
        int f12642a;

        /* renamed from: b */
        C4247i f12643b;

        /* renamed from: c */
        AnimatorSet f12644c;

        /* renamed from: d */
        ArrayList<Animator> f12645d;

        /* renamed from: e */
        C3465a<Animator, String> f12646e;

        public C4239b(Context context, C4239b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f12642a = bVar.f12642a;
                C4247i iVar = bVar.f12643b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f12643b = (C4247i) constantState.newDrawable(resources);
                    } else {
                        this.f12643b = (C4247i) constantState.newDrawable();
                    }
                    C4247i iVar2 = this.f12643b;
                    iVar2.mutate();
                    C4247i iVar3 = iVar2;
                    this.f12643b = iVar3;
                    iVar3.setCallback(callback);
                    this.f12643b.setBounds(bVar.f12643b.getBounds());
                    this.f12643b.mo14492h(false);
                }
                ArrayList<Animator> arrayList = bVar.f12645d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f12645d = new ArrayList<>(size);
                    this.f12646e = new C3465a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f12645d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f12646e.get(animator);
                        clone.setTarget(this.f12643b.mo14483d(str));
                        this.f12645d.add(clone);
                        this.f12646e.put(clone, str);
                    }
                    mo14455a();
                }
            }
        }

        /* renamed from: a */
        public void mo14455a() {
            if (this.f12644c == null) {
                this.f12644c = new AnimatorSet();
            }
            this.f12644c.playTogether(this.f12645d);
        }

        public int getChangingConfigurations() {
            return this.f12642a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C4237c() {
        this((Context) null, (C4239b) null, (Resources) null);
    }

    /* renamed from: a */
    public static C4237c m18628a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C4237c cVar = new C4237c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m18629b(String str, Animator animator) {
        animator.setTarget(this.f12637h.f12643b.mo14483d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m18630c(animator);
        }
        C4239b bVar = this.f12637h;
        if (bVar.f12645d == null) {
            bVar.f12645d = new ArrayList<>();
            this.f12637h.f12646e = new C3465a<>();
        }
        this.f12637h.f12645d.add(animator);
        this.f12637h.f12646e.put(animator, str);
    }

    /* renamed from: c */
    private void m18630c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m18630c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f12639j == null) {
                    this.f12639j = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f12639j);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3275a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3276b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f12637h.f12643b.draw(canvas);
        if (this.f12637h.f12644c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3278d(drawable);
        }
        return this.f12637h.f12643b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12637h.f12642a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3279e(drawable);
        }
        return this.f12637h.f12643b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f12652g == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C4240c(this.f12652g.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f12637h.f12643b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f12637h.f12643b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f12637h.f12643b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3281g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = C0533g.m3252k(resources, theme, attributeSet, C4235a.f12629e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4247i b = C4247i.m18660b(resources, resourceId, theme);
                        b.mo14492h(false);
                        b.setCallback(this.f12640k);
                        C4247i iVar = this.f12637h.f12643b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f12637h.f12643b = b;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C4235a.f12630f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f12638i;
                        if (context != null) {
                            m18629b(string, C4242e.m18642i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f12637h.mo14455a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return C0534a.m3282h(drawable);
        }
        return this.f12637h.f12643b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f12637h.f12644c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f12637h.f12643b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f12637h.f12643b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f12637h.f12643b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f12637h.f12643b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f12637h.f12643b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3284j(drawable, z);
        } else {
            this.f12637h.f12643b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3288n(drawable, i);
        } else {
            this.f12637h.f12643b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3289o(drawable, colorStateList);
        } else {
            this.f12637h.f12643b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            C0534a.m3290p(drawable, mode);
        } else {
            this.f12637h.f12643b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f12637h.f12643b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f12637h.f12644c.isStarted()) {
            this.f12637h.f12644c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f12637h.f12644c.end();
        }
    }

    private C4237c(Context context) {
        this(context, (C4239b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12652g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12637h.f12643b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: e.x.a.a.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C4240c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f12647a;

        public C4240c(Drawable.ConstantState constantState) {
            this.f12647a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f12647a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f12647a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C4237c cVar = new C4237c();
            Drawable newDrawable = this.f12647a.newDrawable();
            cVar.f12652g = newDrawable;
            newDrawable.setCallback(cVar.f12640k);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C4237c cVar = new C4237c();
            Drawable newDrawable = this.f12647a.newDrawable(resources);
            cVar.f12652g = newDrawable;
            newDrawable.setCallback(cVar.f12640k);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C4237c cVar = new C4237c();
            Drawable newDrawable = this.f12647a.newDrawable(resources, theme);
            cVar.f12652g = newDrawable;
            newDrawable.setCallback(cVar.f12640k);
            return cVar;
        }
    }

    private C4237c(Context context, C4239b bVar, Resources resources) {
        this.f12639j = null;
        C4238a aVar = new C4238a();
        this.f12640k = aVar;
        this.f12638i = context;
        if (bVar != null) {
            this.f12637h = bVar;
        } else {
            this.f12637h = new C4239b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
