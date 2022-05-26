package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.p018u.C1553a;
import com.airbnb.lottie.p018u.C1554b;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.C1563h;
import com.airbnb.lottie.p019v.p022l.C1607b;
import com.airbnb.lottie.p024x.C1670v;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1680e;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.lottie.f */
/* compiled from: LottieDrawable */
public class C1473f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    private boolean f5655A;

    /* renamed from: B */
    private boolean f5656B;

    /* renamed from: C */
    private boolean f5657C;

    /* renamed from: g */
    private final Matrix f5658g = new Matrix();

    /* renamed from: h */
    private C1464d f5659h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1680e f5660i;

    /* renamed from: j */
    private float f5661j;

    /* renamed from: k */
    private boolean f5662k;

    /* renamed from: l */
    private boolean f5663l;

    /* renamed from: m */
    private boolean f5664m;

    /* renamed from: n */
    private final ArrayList<C1488o> f5665n;

    /* renamed from: o */
    private final ValueAnimator.AnimatorUpdateListener f5666o;

    /* renamed from: p */
    private C1554b f5667p;

    /* renamed from: q */
    private String f5668q;

    /* renamed from: r */
    private C1461b f5669r;

    /* renamed from: s */
    private C1553a f5670s;

    /* renamed from: t */
    C1460a f5671t;

    /* renamed from: u */
    C1504s f5672u;

    /* renamed from: v */
    private boolean f5673v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C1607b f5674w;

    /* renamed from: x */
    private int f5675x;

    /* renamed from: y */
    private boolean f5676y;

    /* renamed from: z */
    private boolean f5677z;

    /* renamed from: com.airbnb.lottie.f$a */
    /* compiled from: LottieDrawable */
    class C1474a implements C1488o {

        /* renamed from: a */
        final /* synthetic */ String f5678a;

        C1474a(String str) {
            this.f5678a = str;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7062Z(this.f5678a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$b */
    /* compiled from: LottieDrawable */
    class C1475b implements C1488o {

        /* renamed from: a */
        final /* synthetic */ int f5680a;

        /* renamed from: b */
        final /* synthetic */ int f5681b;

        C1475b(int i, int i2) {
            this.f5680a = i;
            this.f5681b = i2;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7061Y(this.f5680a, this.f5681b);
        }
    }

    /* renamed from: com.airbnb.lottie.f$c */
    /* compiled from: LottieDrawable */
    class C1476c implements C1488o {

        /* renamed from: a */
        final /* synthetic */ int f5683a;

        C1476c(int i) {
            this.f5683a = i;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7054R(this.f5683a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$d */
    /* compiled from: LottieDrawable */
    class C1477d implements C1488o {

        /* renamed from: a */
        final /* synthetic */ float f5685a;

        C1477d(float f) {
            this.f5685a = f;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7071f0(this.f5685a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$e */
    /* compiled from: LottieDrawable */
    class C1478e implements C1488o {

        /* renamed from: a */
        final /* synthetic */ C1560e f5687a;

        /* renamed from: b */
        final /* synthetic */ Object f5688b;

        /* renamed from: c */
        final /* synthetic */ C1690c f5689c;

        C1478e(C1560e eVar, Object obj, C1690c cVar) {
            this.f5687a = eVar;
            this.f5688b = obj;
            this.f5689c = cVar;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7067d(this.f5687a, this.f5688b, this.f5689c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f */
    /* compiled from: LottieDrawable */
    class C1479f implements ValueAnimator.AnimatorUpdateListener {
        C1479f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C1473f.this.f5674w != null) {
                C1473f.this.f5674w.mo7365K(C1473f.this.f5660i.mo7473i());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.f$g */
    /* compiled from: LottieDrawable */
    class C1480g implements C1488o {
        C1480g() {
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7048L();
        }
    }

    /* renamed from: com.airbnb.lottie.f$h */
    /* compiled from: LottieDrawable */
    class C1481h implements C1488o {
        C1481h() {
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7050N();
        }
    }

    /* renamed from: com.airbnb.lottie.f$i */
    /* compiled from: LottieDrawable */
    class C1482i implements C1488o {

        /* renamed from: a */
        final /* synthetic */ int f5694a;

        C1482i(int i) {
            this.f5694a = i;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7063a0(this.f5694a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$j */
    /* compiled from: LottieDrawable */
    class C1483j implements C1488o {

        /* renamed from: a */
        final /* synthetic */ float f5696a;

        C1483j(float f) {
            this.f5696a = f;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7066c0(this.f5696a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$k */
    /* compiled from: LottieDrawable */
    class C1484k implements C1488o {

        /* renamed from: a */
        final /* synthetic */ int f5698a;

        C1484k(int i) {
            this.f5698a = i;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7058V(this.f5698a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$l */
    /* compiled from: LottieDrawable */
    class C1485l implements C1488o {

        /* renamed from: a */
        final /* synthetic */ float f5700a;

        C1485l(float f) {
            this.f5700a = f;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7060X(this.f5700a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$m */
    /* compiled from: LottieDrawable */
    class C1486m implements C1488o {

        /* renamed from: a */
        final /* synthetic */ String f5702a;

        C1486m(String str) {
            this.f5702a = str;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7064b0(this.f5702a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$n */
    /* compiled from: LottieDrawable */
    class C1487n implements C1488o {

        /* renamed from: a */
        final /* synthetic */ String f5704a;

        C1487n(String str) {
            this.f5704a = str;
        }

        /* renamed from: a */
        public void mo7104a(C1464d dVar) {
            C1473f.this.mo7059W(this.f5704a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$o */
    /* compiled from: LottieDrawable */
    private interface C1488o {
        /* renamed from: a */
        void mo7104a(C1464d dVar);
    }

    public C1473f() {
        C1680e eVar = new C1680e();
        this.f5660i = eVar;
        this.f5661j = 1.0f;
        this.f5662k = true;
        this.f5663l = false;
        this.f5664m = false;
        this.f5665n = new ArrayList<>();
        C1479f fVar = new C1479f();
        this.f5666o = fVar;
        this.f5675x = 255;
        this.f5656B = true;
        this.f5657C = false;
        eVar.addUpdateListener(fVar);
    }

    /* renamed from: e */
    private boolean m7664e() {
        return this.f5662k || this.f5663l;
    }

    /* renamed from: f */
    private float m7665f(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: g */
    private boolean m7666g() {
        C1464d dVar = this.f5659h;
        if (dVar == null || getBounds().isEmpty() || m7665f(getBounds()) == m7665f(dVar.mo7003b())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m7667h() {
        C1607b bVar = new C1607b(this, C1670v.m8390a(this.f5659h), this.f5659h.mo7012k(), this.f5659h);
        this.f5674w = bVar;
        if (this.f5677z) {
            bVar.mo7363I(true);
        }
    }

    /* renamed from: k */
    private void m7668k(Canvas canvas) {
        if (!m7666g()) {
            m7669l(canvas);
        } else {
            m7670m(canvas);
        }
    }

    /* renamed from: l */
    private void m7669l(Canvas canvas) {
        float f;
        if (this.f5674w != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f5659h.mo7003b().width());
            float height = ((float) bounds.height()) / ((float) this.f5659h.mo7003b().height());
            if (this.f5656B) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f5658g.reset();
            this.f5658g.preScale(width, height);
            this.f5674w.mo7136f(canvas, this.f5658g, this.f5675x);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: m */
    private void m7670m(Canvas canvas) {
        float f;
        if (this.f5674w != null) {
            float f2 = this.f5661j;
            float y = m7674y(canvas);
            if (f2 > y) {
                f = this.f5661j / y;
            } else {
                y = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f5659h.mo7003b().width()) / 2.0f;
                float height = ((float) this.f5659h.mo7003b().height()) / 2.0f;
                float f3 = width * y;
                float f4 = height * y;
                canvas.translate((mo7041E() * width) - f3, (mo7041E() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f5658g.reset();
            this.f5658g.preScale(y, y);
            this.f5674w.mo7136f(canvas, this.f5658g, this.f5675x);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: r */
    private Context m7671r() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: s */
    private C1553a m7672s() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f5670s == null) {
            this.f5670s = new C1553a(getCallback(), this.f5671t);
        }
        return this.f5670s;
    }

    /* renamed from: v */
    private C1554b m7673v() {
        if (getCallback() == null) {
            return null;
        }
        C1554b bVar = this.f5667p;
        if (bVar != null && !bVar.mo7214b(m7671r())) {
            this.f5667p = null;
        }
        if (this.f5667p == null) {
            this.f5667p = new C1554b(getCallback(), this.f5668q, this.f5669r, this.f5659h.mo7011j());
        }
        return this.f5667p;
    }

    /* renamed from: y */
    private float m7674y(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f5659h.mo7003b().width()), ((float) canvas.getHeight()) / ((float) this.f5659h.mo7003b().height()));
    }

    /* renamed from: A */
    public C1498n mo7037A() {
        C1464d dVar = this.f5659h;
        if (dVar != null) {
            return dVar.mo7015n();
        }
        return null;
    }

    /* renamed from: B */
    public float mo7038B() {
        return this.f5660i.mo7473i();
    }

    /* renamed from: C */
    public int mo7039C() {
        return this.f5660i.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: D */
    public int mo7040D() {
        return this.f5660i.getRepeatMode();
    }

    /* renamed from: E */
    public float mo7041E() {
        return this.f5661j;
    }

    /* renamed from: F */
    public float mo7042F() {
        return this.f5660i.mo7478n();
    }

    /* renamed from: G */
    public C1504s mo7043G() {
        return this.f5672u;
    }

    /* renamed from: H */
    public Typeface mo7044H(String str, String str2) {
        C1553a s = m7672s();
        if (s != null) {
            return s.mo7211b(str, str2);
        }
        return null;
    }

    /* renamed from: I */
    public boolean mo7045I() {
        C1680e eVar = this.f5660i;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    /* renamed from: J */
    public boolean mo7046J() {
        return this.f5655A;
    }

    /* renamed from: K */
    public void mo7047K() {
        this.f5665n.clear();
        this.f5660i.mo7479q();
    }

    /* renamed from: L */
    public void mo7048L() {
        if (this.f5674w == null) {
            this.f5665n.add(new C1480g());
            return;
        }
        if (m7664e() || mo7039C() == 0) {
            this.f5660i.mo7480r();
        }
        if (!m7664e()) {
            mo7054R((int) (mo7042F() < 0.0f ? mo7103z() : mo7102x()));
            this.f5660i.mo7472h();
        }
    }

    /* renamed from: M */
    public List<C1560e> mo7049M(C1560e eVar) {
        if (this.f5674w == null) {
            C1679d.m8416c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f5674w.mo7134c(eVar, 0, arrayList, new C1560e(new String[0]));
        return arrayList;
    }

    /* renamed from: N */
    public void mo7050N() {
        if (this.f5674w == null) {
            this.f5665n.add(new C1481h());
            return;
        }
        if (m7664e() || mo7039C() == 0) {
            this.f5660i.mo7485v();
        }
        if (!m7664e()) {
            mo7054R((int) (mo7042F() < 0.0f ? mo7103z() : mo7102x()));
            this.f5660i.mo7472h();
        }
    }

    /* renamed from: O */
    public void mo7051O(boolean z) {
        this.f5655A = z;
    }

    /* renamed from: P */
    public boolean mo7052P(C1464d dVar) {
        if (this.f5659h == dVar) {
            return false;
        }
        this.f5657C = false;
        mo7083j();
        this.f5659h = dVar;
        m7667h();
        this.f5660i.mo7487y(dVar);
        mo7071f0(this.f5660i.getAnimatedFraction());
        mo7084j0(this.f5661j);
        Iterator it = new ArrayList(this.f5665n).iterator();
        while (it.hasNext()) {
            C1488o oVar = (C1488o) it.next();
            if (oVar != null) {
                oVar.mo7104a(dVar);
            }
            it.remove();
        }
        this.f5665n.clear();
        dVar.mo7024v(this.f5676y);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: Q */
    public void mo7053Q(C1460a aVar) {
        C1553a aVar2 = this.f5670s;
        if (aVar2 != null) {
            aVar2.mo7212c(aVar);
        }
    }

    /* renamed from: R */
    public void mo7054R(int i) {
        if (this.f5659h == null) {
            this.f5665n.add(new C1476c(i));
        } else {
            this.f5660i.mo7488z((float) i);
        }
    }

    /* renamed from: S */
    public void mo7055S(boolean z) {
        this.f5663l = z;
    }

    /* renamed from: T */
    public void mo7056T(C1461b bVar) {
        this.f5669r = bVar;
        C1554b bVar2 = this.f5667p;
        if (bVar2 != null) {
            bVar2.mo7215d(bVar);
        }
    }

    /* renamed from: U */
    public void mo7057U(String str) {
        this.f5668q = str;
    }

    /* renamed from: V */
    public void mo7058V(int i) {
        if (this.f5659h == null) {
            this.f5665n.add(new C1484k(i));
        } else {
            this.f5660i.mo7462A(((float) i) + 0.99f);
        }
    }

    /* renamed from: W */
    public void mo7059W(String str) {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            this.f5665n.add(new C1487n(str));
            return;
        }
        C1563h l = dVar.mo7013l(str);
        if (l != null) {
            mo7058V((int) (l.f6005b + l.f6006c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: X */
    public void mo7060X(float f) {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            this.f5665n.add(new C1485l(f));
        } else {
            mo7058V((int) C1682g.m8452k(dVar.mo7017p(), this.f5659h.mo7007f(), f));
        }
    }

    /* renamed from: Y */
    public void mo7061Y(int i, int i2) {
        if (this.f5659h == null) {
            this.f5665n.add(new C1475b(i, i2));
        } else {
            this.f5660i.mo7463B((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: Z */
    public void mo7062Z(String str) {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            this.f5665n.add(new C1474a(str));
            return;
        }
        C1563h l = dVar.mo7013l(str);
        if (l != null) {
            int i = (int) l.f6005b;
            mo7061Y(i, ((int) l.f6006c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: a0 */
    public void mo7063a0(int i) {
        if (this.f5659h == null) {
            this.f5665n.add(new C1482i(i));
        } else {
            this.f5660i.mo7464C(i);
        }
    }

    /* renamed from: b0 */
    public void mo7064b0(String str) {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            this.f5665n.add(new C1486m(str));
            return;
        }
        C1563h l = dVar.mo7013l(str);
        if (l != null) {
            mo7063a0((int) l.f6005b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: c */
    public void mo7065c(Animator.AnimatorListener animatorListener) {
        this.f5660i.addListener(animatorListener);
    }

    /* renamed from: c0 */
    public void mo7066c0(float f) {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            this.f5665n.add(new C1483j(f));
        } else {
            mo7063a0((int) C1682g.m8452k(dVar.mo7017p(), this.f5659h.mo7007f(), f));
        }
    }

    /* renamed from: d */
    public <T> void mo7067d(C1560e eVar, T t, C1690c<T> cVar) {
        C1607b bVar = this.f5674w;
        if (bVar == null) {
            this.f5665n.add(new C1478e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar == C1560e.f5998c) {
            bVar.mo7137g(t, cVar);
        } else if (eVar.mo7232d() != null) {
            eVar.mo7232d().mo7137g(t, cVar);
        } else {
            List<C1560e> M = mo7049M(eVar);
            for (int i = 0; i < M.size(); i++) {
                M.get(i).mo7232d().mo7137g(t, cVar);
            }
            z = true ^ M.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C1493k.f5715E) {
                mo7071f0(mo7038B());
            }
        }
    }

    /* renamed from: d0 */
    public void mo7068d0(boolean z) {
        if (this.f5677z != z) {
            this.f5677z = z;
            C1607b bVar = this.f5674w;
            if (bVar != null) {
                bVar.mo7363I(z);
            }
        }
    }

    public void draw(Canvas canvas) {
        this.f5657C = false;
        C1462c.m7603a("Drawable#draw");
        if (this.f5664m) {
            try {
                m7668k(canvas);
            } catch (Throwable th) {
                C1679d.m8415b("Lottie crashed in draw!", th);
            }
        } else {
            m7668k(canvas);
        }
        C1462c.m7604b("Drawable#draw");
    }

    /* renamed from: e0 */
    public void mo7070e0(boolean z) {
        this.f5676y = z;
        C1464d dVar = this.f5659h;
        if (dVar != null) {
            dVar.mo7024v(z);
        }
    }

    /* renamed from: f0 */
    public void mo7071f0(float f) {
        if (this.f5659h == null) {
            this.f5665n.add(new C1477d(f));
            return;
        }
        C1462c.m7603a("Drawable#setProgress");
        this.f5660i.mo7488z(this.f5659h.mo7009h(f));
        C1462c.m7604b("Drawable#setProgress");
    }

    /* renamed from: g0 */
    public void mo7072g0(int i) {
        this.f5660i.setRepeatCount(i);
    }

    public int getAlpha() {
        return this.f5675x;
    }

    public int getIntrinsicHeight() {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo7003b().height()) * mo7041E());
    }

    public int getIntrinsicWidth() {
        C1464d dVar = this.f5659h;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo7003b().width()) * mo7041E());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h0 */
    public void mo7077h0(int i) {
        this.f5660i.setRepeatMode(i);
    }

    /* renamed from: i */
    public void mo7078i() {
        this.f5665n.clear();
        this.f5660i.cancel();
    }

    /* renamed from: i0 */
    public void mo7079i0(boolean z) {
        this.f5664m = z;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f5657C) {
            this.f5657C = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo7045I();
    }

    /* renamed from: j */
    public void mo7083j() {
        if (this.f5660i.isRunning()) {
            this.f5660i.cancel();
        }
        this.f5659h = null;
        this.f5674w = null;
        this.f5667p = null;
        this.f5660i.mo7468g();
        invalidateSelf();
    }

    /* renamed from: j0 */
    public void mo7084j0(float f) {
        this.f5661j = f;
    }

    /* renamed from: k0 */
    public void mo7085k0(float f) {
        this.f5660i.mo7465D(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo7086l0(Boolean bool) {
        this.f5662k = bool.booleanValue();
    }

    /* renamed from: m0 */
    public void mo7087m0(C1504s sVar) {
    }

    /* renamed from: n */
    public void mo7088n(boolean z) {
        if (this.f5673v != z) {
            if (Build.VERSION.SDK_INT < 19) {
                C1679d.m8416c("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f5673v = z;
            if (this.f5659h != null) {
                m7667h();
            }
        }
    }

    /* renamed from: n0 */
    public boolean mo7089n0() {
        return this.f5672u == null && this.f5659h.mo7004c().mo12416m() > 0;
    }

    /* renamed from: o */
    public boolean mo7090o() {
        return this.f5673v;
    }

    /* renamed from: p */
    public void mo7091p() {
        this.f5665n.clear();
        this.f5660i.mo7472h();
    }

    /* renamed from: q */
    public C1464d mo7092q() {
        return this.f5659h;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f5675x = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1679d.m8416c("Use addColorFilter instead.");
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo7048L();
        }
    }

    public void stop() {
        mo7091p();
    }

    /* renamed from: t */
    public int mo7098t() {
        return (int) this.f5660i.mo7475j();
    }

    /* renamed from: u */
    public Bitmap mo7099u(String str) {
        C1554b v = m7673v();
        if (v != null) {
            return v.mo7213a(str);
        }
        C1464d dVar = this.f5659h;
        C1489g gVar = dVar == null ? null : dVar.mo7011j().get(str);
        if (gVar != null) {
            return gVar.mo7106a();
        }
        return null;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: w */
    public String mo7101w() {
        return this.f5668q;
    }

    /* renamed from: x */
    public float mo7102x() {
        return this.f5660i.mo7476l();
    }

    /* renamed from: z */
    public float mo7103z() {
        return this.f5660i.mo7477m();
    }
}
