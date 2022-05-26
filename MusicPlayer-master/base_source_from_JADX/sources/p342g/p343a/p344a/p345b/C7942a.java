package p342g.p343a.p344a.p345b;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.widget.ViewAnimator;
import p342g.p343a.p344a.p345b.C7945b;

/* renamed from: g.a.a.b.a */
/* compiled from: AnimationFactory */
public class C7942a {

    /* renamed from: g.a.a.b.a$a */
    /* compiled from: AnimationFactory */
    static /* synthetic */ class C7943a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33668a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                g.a.a.b.a$b[] r0 = p342g.p343a.p344a.p345b.C7942a.C7944b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33668a = r0
                g.a.a.b.a$b r1 = p342g.p343a.p344a.p345b.C7942a.C7944b.LEFT_RIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33668a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.a.a.b.a$b r1 = p342g.p343a.p344a.p345b.C7942a.C7944b.TOP_BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33668a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.a.a.b.a$b r1 = p342g.p343a.p344a.p345b.C7942a.C7944b.RIGHT_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33668a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.a.a.b.a$b r1 = p342g.p343a.p344a.p345b.C7942a.C7944b.BOTTOM_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p345b.C7942a.C7943a.<clinit>():void");
        }
    }

    /* renamed from: g.a.a.b.a$b */
    /* compiled from: AnimationFactory */
    public enum C7944b {
        LEFT_RIGHT,
        RIGHT_LEFT,
        TOP_BOTTOM,
        BOTTOM_TOP;

        public float getEndDegreeForFirstView() {
            int i = C7943a.f33668a[ordinal()];
            if (i == 1 || i == 2) {
                return 90.0f;
            }
            return (i == 3 || i == 4) ? -90.0f : 0.0f;
        }

        public float getEndDegreeForSecondView() {
            return 0.0f;
        }

        public float getStartDegreeForFirstView() {
            return 0.0f;
        }

        public float getStartDegreeForSecondView() {
            int i = C7943a.f33668a[ordinal()];
            if (i == 1 || i == 2) {
                return -90.0f;
            }
            return (i == 3 || i == 4) ? 90.0f : 0.0f;
        }

        public C7944b theOtherDirection() {
            int i = C7943a.f33668a[ordinal()];
            if (i == 1) {
                return RIGHT_LEFT;
            }
            if (i == 2) {
                return BOTTOM_TOP;
            }
            if (i == 3) {
                return LEFT_RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return TOP_BOTTOM;
        }
    }

    /* renamed from: a */
    public static Animation[] m43546a(View view, View view2, C7944b bVar, long j, Interpolator interpolator) {
        C7944b bVar2 = bVar;
        long j2 = j;
        Animation[] animationArr = new Animation[2];
        float width = ((float) view.getWidth()) / 2.0f;
        float height = ((float) view.getHeight()) / 2.0f;
        C7945b bVar3 = new C7945b(bVar.getStartDegreeForFirstView(), bVar.getEndDegreeForFirstView(), width, height, 0.6f, C7945b.C7947b.SCALE_DOWN);
        bVar3.setDuration(j2);
        bVar3.setFillAfter(true);
        bVar3.setInterpolator(interpolator == null ? new AccelerateInterpolator() : interpolator);
        C7944b bVar4 = C7944b.BOTTOM_TOP;
        if (bVar2 == bVar4 || bVar2 == C7944b.TOP_BOTTOM) {
            bVar3.mo29475a(0);
        } else {
            bVar3.mo29475a(1);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(bVar3);
        animationArr[0] = animationSet;
        C7945b bVar5 = new C7945b(bVar.getStartDegreeForSecondView(), bVar.getEndDegreeForSecondView(), width, height, 0.6f, C7945b.C7947b.SCALE_UP);
        bVar5.setDuration(j2);
        bVar5.setFillAfter(true);
        bVar5.setInterpolator(interpolator == null ? new AccelerateInterpolator() : interpolator);
        bVar5.setStartOffset(j2);
        if (bVar2 == bVar4 || bVar2 == C7944b.TOP_BOTTOM) {
            bVar5.mo29475a(0);
        } else {
            bVar5.mo29475a(1);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(bVar5);
        animationArr[1] = animationSet2;
        return animationArr;
    }

    /* renamed from: b */
    public static void m43547b(ViewAnimator viewAnimator, C7944b bVar) {
        m43548c(viewAnimator, bVar, 350);
    }

    /* renamed from: c */
    public static void m43548c(ViewAnimator viewAnimator, C7944b bVar, long j) {
        View currentView = viewAnimator.getCurrentView();
        int displayedChild = viewAnimator.getDisplayedChild();
        int childCount = (displayedChild + 1) % viewAnimator.getChildCount();
        View childAt = viewAnimator.getChildAt(childCount);
        if (childCount < displayedChild) {
            bVar = bVar.theOtherDirection();
        }
        Animation[] a = m43546a(currentView, childAt, bVar, j, (Interpolator) null);
        viewAnimator.setOutAnimation(a[0]);
        viewAnimator.setInAnimation(a[1]);
        viewAnimator.showNext();
    }
}
