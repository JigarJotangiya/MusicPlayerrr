package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3713d;
import p082e.p109h.p119p.C3774v;
import p082e.p147t.C4133b;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: ItemTouchHelper */
public class C0885l extends RecyclerView.C0808o implements RecyclerView.C0814q {

    /* renamed from: A */
    private List<RecyclerView.C0792c0> f3973A;

    /* renamed from: B */
    private List<Integer> f3974B;

    /* renamed from: C */
    private RecyclerView.C0801k f3975C = null;

    /* renamed from: D */
    View f3976D = null;

    /* renamed from: E */
    int f3977E = -1;

    /* renamed from: F */
    C3713d f3978F;

    /* renamed from: G */
    private C0894g f3979G;

    /* renamed from: H */
    private final RecyclerView.C0816s f3980H = new C0887b();

    /* renamed from: I */
    private Rect f3981I;

    /* renamed from: J */
    private long f3982J;

    /* renamed from: g */
    final List<View> f3983g = new ArrayList();

    /* renamed from: h */
    private final float[] f3984h = new float[2];

    /* renamed from: i */
    RecyclerView.C0792c0 f3985i = null;

    /* renamed from: j */
    float f3986j;

    /* renamed from: k */
    float f3987k;

    /* renamed from: l */
    private float f3988l;

    /* renamed from: m */
    private float f3989m;

    /* renamed from: n */
    float f3990n;

    /* renamed from: o */
    float f3991o;

    /* renamed from: p */
    private float f3992p;

    /* renamed from: q */
    private float f3993q;

    /* renamed from: r */
    int f3994r = -1;

    /* renamed from: s */
    C0891f f3995s;

    /* renamed from: t */
    private int f3996t = 0;

    /* renamed from: u */
    int f3997u;

    /* renamed from: v */
    List<C0895h> f3998v = new ArrayList();

    /* renamed from: w */
    private int f3999w;

    /* renamed from: x */
    RecyclerView f4000x;

    /* renamed from: y */
    final Runnable f4001y = new C0886a();

    /* renamed from: z */
    VelocityTracker f4002z;

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* compiled from: ItemTouchHelper */
    class C0886a implements Runnable {
        C0886a() {
        }

        public void run() {
            C0885l lVar = C0885l.this;
            if (lVar.f3985i != null && lVar.mo5306B()) {
                C0885l lVar2 = C0885l.this;
                RecyclerView.C0792c0 c0Var = lVar2.f3985i;
                if (c0Var != null) {
                    lVar2.mo5316w(c0Var);
                }
                C0885l lVar3 = C0885l.this;
                lVar3.f4000x.removeCallbacks(lVar3.f4001y);
                C3774v.m16201g0(C0885l.this.f4000x, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* compiled from: ItemTouchHelper */
    class C0887b implements RecyclerView.C0816s {
        C0887b() {
        }

        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C0895h p;
            C0885l.this.f3978F.mo13020a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C0885l.this.f3994r = motionEvent.getPointerId(0);
                C0885l.this.f3986j = motionEvent.getX();
                C0885l.this.f3987k = motionEvent.getY();
                C0885l.this.mo5317x();
                C0885l lVar = C0885l.this;
                if (lVar.f3985i == null && (p = lVar.mo5313p(motionEvent)) != null) {
                    C0885l lVar2 = C0885l.this;
                    lVar2.f3986j -= p.f4022i;
                    lVar2.f3987k -= p.f4023j;
                    lVar2.mo5312o(p.f4018e, true);
                    if (C0885l.this.f3983g.remove(p.f4018e.itemView)) {
                        C0885l lVar3 = C0885l.this;
                        lVar3.f3995s.clearView(lVar3.f4000x, p.f4018e);
                    }
                    C0885l.this.mo5307C(p.f4018e, p.f4019f);
                    C0885l lVar4 = C0885l.this;
                    lVar4.mo5309I(motionEvent, lVar4.f3997u, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C0885l lVar5 = C0885l.this;
                lVar5.f3994r = -1;
                lVar5.mo5307C((RecyclerView.C0792c0) null, 0);
            } else {
                int i = C0885l.this.f3994r;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C0885l.this.mo5311l(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C0885l.this.f4002z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0885l.this.f3985i != null) {
                return true;
            }
            return false;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                C0885l.this.mo5307C((RecyclerView.C0792c0) null, 0);
            }
        }

        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            C0885l.this.f3978F.mo13020a(motionEvent);
            VelocityTracker velocityTracker = C0885l.this.f4002z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0885l.this.f3994r != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C0885l.this.f3994r);
                if (findPointerIndex >= 0) {
                    C0885l.this.mo5311l(actionMasked, motionEvent, findPointerIndex);
                }
                C0885l lVar = C0885l.this;
                RecyclerView.C0792c0 c0Var = lVar.f3985i;
                if (c0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = lVar.f4002z;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C0885l lVar2 = C0885l.this;
                                if (pointerId == lVar2.f3994r) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    lVar2.f3994r = motionEvent.getPointerId(i);
                                    C0885l lVar3 = C0885l.this;
                                    lVar3.mo5309I(motionEvent, lVar3.f3997u, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            lVar.mo5309I(motionEvent, lVar.f3997u, findPointerIndex);
                            C0885l.this.mo5316w(c0Var);
                            C0885l lVar4 = C0885l.this;
                            lVar4.f4000x.removeCallbacks(lVar4.f4001y);
                            C0885l.this.f4001y.run();
                            C0885l.this.f4000x.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C0885l.this.mo5307C((RecyclerView.C0792c0) null, 0);
                    C0885l.this.f3994r = -1;
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* compiled from: ItemTouchHelper */
    class C0888c extends C0895h {

        /* renamed from: n */
        final /* synthetic */ int f4005n;

        /* renamed from: o */
        final /* synthetic */ RecyclerView.C0792c0 f4006o;

        /* renamed from: p */
        final /* synthetic */ C0885l f4007p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0888c(C0885l lVar, RecyclerView.C0792c0 c0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C0792c0 c0Var2) {
            super(c0Var, i, i2, f, f2, f3, f4);
            this.f4007p = lVar;
            this.f4005n = i3;
            this.f4006o = c0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f4024k) {
                if (this.f4005n <= 0) {
                    C0885l lVar = this.f4007p;
                    lVar.f3995s.clearView(lVar.f4000x, this.f4006o);
                } else {
                    this.f4007p.f3983g.add(this.f4006o.itemView);
                    this.f4021h = true;
                    int i = this.f4005n;
                    if (i > 0) {
                        this.f4007p.mo5318y(this, i);
                    }
                }
                C0885l lVar2 = this.f4007p;
                View view = lVar2.f3976D;
                View view2 = this.f4006o.itemView;
                if (view == view2) {
                    lVar2.mo5305A(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    /* compiled from: ItemTouchHelper */
    class C0889d implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C0895h f4008g;

        /* renamed from: h */
        final /* synthetic */ int f4009h;

        C0889d(C0895h hVar, int i) {
            this.f4008g = hVar;
            this.f4009h = i;
        }

        public void run() {
            RecyclerView recyclerView = C0885l.this.f4000x;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C0895h hVar = this.f4008g;
                if (!hVar.f4024k && hVar.f4018e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.C0803m itemAnimator = C0885l.this.f4000x.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo4859q((RecyclerView.C0803m.C0804a) null)) && !C0885l.this.mo5315u()) {
                        C0885l.this.f3995s.onSwiped(this.f4008g.f4018e, this.f4009h);
                    } else {
                        C0885l.this.f4000x.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$e */
    /* compiled from: ItemTouchHelper */
    class C0890e implements RecyclerView.C0801k {
        C0890e() {
        }

        /* renamed from: a */
        public int mo4841a(int i, int i2) {
            C0885l lVar = C0885l.this;
            View view = lVar.f3976D;
            if (view == null) {
                return i2;
            }
            int i3 = lVar.f3977E;
            if (i3 == -1) {
                i3 = lVar.f4000x.indexOfChild(view);
                C0885l.this.f3977E = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            return i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$f */
    /* compiled from: ItemTouchHelper */
    public static abstract class C0891f {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new C0892a();
        private static final Interpolator sDragViewScrollCapInterpolator = new C0893b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.l$f$a */
        /* compiled from: ItemTouchHelper */
        class C0892a implements Interpolator {
            C0892a() {
            }

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.l$f$b */
        /* compiled from: ItemTouchHelper */
        class C0893b implements Interpolator {
            C0893b() {
            }

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static C0898m getDefaultUIUtil() {
            return C0899n.f4028a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C4133b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
            return true;
        }

        public RecyclerView.C0792c0 chooseDropTarget(RecyclerView.C0792c0 c0Var, List<RecyclerView.C0792c0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.C0792c0 c0Var2 = c0Var;
            int width = i + c0Var2.itemView.getWidth();
            int height = i2 + c0Var2.itemView.getHeight();
            int left2 = i - c0Var2.itemView.getLeft();
            int top2 = i2 - c0Var2.itemView.getTop();
            int size = list.size();
            RecyclerView.C0792c0 c0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.C0792c0 c0Var4 = list.get(i4);
                if (left2 > 0 && (right = c0Var4.itemView.getRight() - width) < 0 && c0Var4.itemView.getRight() > c0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    c0Var3 = c0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = c0Var4.itemView.getLeft() - i) > 0 && c0Var4.itemView.getLeft() < c0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    c0Var3 = c0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = c0Var4.itemView.getTop() - i2) > 0 && c0Var4.itemView.getTop() < c0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    c0Var3 = c0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = c0Var4.itemView.getBottom() - height) < 0 && c0Var4.itemView.getBottom() > c0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    c0Var3 = c0Var4;
                    i3 = abs;
                }
            }
            return c0Var3;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
            C0899n.f4028a.mo5361a(c0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        /* access modifiers changed from: package-private */
        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, c0Var), C3774v.m16151B(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.C0803m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                return itemAnimator.mo4856n();
            }
            return itemAnimator.mo4857o();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.C0792c0 c0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.C0792c0 c0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        /* access modifiers changed from: package-private */
        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
            return (getAbsoluteMovementFlags(recyclerView, c0Var) & 16711680) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var) {
            return (getAbsoluteMovementFlags(recyclerView, c0Var) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * getMaxDragScroll(recyclerView))) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * sDragScrollInterpolator.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public abstract boolean isItemViewSwipeEnabled();

        public abstract boolean isLongPressDragEnabled();

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, float f, float f2, int i, boolean z) {
            C0899n.f4028a.mo5364d(canvas, recyclerView, c0Var.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, float f, float f2, int i, boolean z) {
            C0899n.f4028a.mo5363c(canvas, recyclerView, c0Var.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, List<C0895h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0895h hVar = list.get(i2);
                hVar.mo5356e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, hVar.f4018e, hVar.f4022i, hVar.f4023j, hVar.f4019f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, c0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* access modifiers changed from: package-private */
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, List<C0895h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C0895h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0895h hVar = list2.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, hVar.f4018e, hVar.f4022i, hVar.f4023j, hVar.f4019f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, c0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0895h hVar2 = list2.get(i3);
                boolean z2 = hVar2.f4025l;
                if (z2 && !hVar2.f4021h) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.C0792c0 c0Var, int i, RecyclerView.C0792c0 c0Var2, int i2, int i3, int i4) {
            RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C0897i) {
                ((C0897i) layoutManager).mo4488b(c0Var.itemView, c0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo4495l()) {
                if (layoutManager.mo4911R(c0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo4657q1(i2);
                }
                if (layoutManager.mo4915U(c0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo4657q1(i2);
                }
            }
            if (layoutManager.mo4496m()) {
                if (layoutManager.mo4916V(c0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo4657q1(i2);
                }
                if (layoutManager.mo4908P(c0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo4657q1(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.C0792c0 c0Var, int i) {
            if (c0Var != null) {
                C0899n.f4028a.mo5362b(c0Var.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.C0792c0 c0Var, int i);
    }

    /* renamed from: androidx.recyclerview.widget.l$g */
    /* compiled from: ItemTouchHelper */
    private class C0894g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        private boolean f4012a = true;

        C0894g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5349a() {
            this.f4012a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View q;
            RecyclerView.C0792c0 j0;
            int i;
            if (this.f4012a && (q = C0885l.this.mo5314q(motionEvent)) != null && (j0 = C0885l.this.f4000x.mo4632j0(q)) != null) {
                C0885l lVar = C0885l.this;
                if (lVar.f3995s.hasDragFlag(lVar.f4000x, j0) && motionEvent.getPointerId(0) == (i = C0885l.this.f3994r)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C0885l lVar2 = C0885l.this;
                    lVar2.f3986j = x;
                    lVar2.f3987k = y;
                    lVar2.f3991o = 0.0f;
                    lVar2.f3990n = 0.0f;
                    if (lVar2.f3995s.isLongPressDragEnabled()) {
                        C0885l.this.mo5307C(j0, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$h */
    /* compiled from: ItemTouchHelper */
    static class C0895h implements Animator.AnimatorListener {

        /* renamed from: a */
        final float f4014a;

        /* renamed from: b */
        final float f4015b;

        /* renamed from: c */
        final float f4016c;

        /* renamed from: d */
        final float f4017d;

        /* renamed from: e */
        final RecyclerView.C0792c0 f4018e;

        /* renamed from: f */
        final int f4019f;

        /* renamed from: g */
        final ValueAnimator f4020g;

        /* renamed from: h */
        boolean f4021h;

        /* renamed from: i */
        float f4022i;

        /* renamed from: j */
        float f4023j;

        /* renamed from: k */
        boolean f4024k = false;

        /* renamed from: l */
        boolean f4025l = false;

        /* renamed from: m */
        private float f4026m;

        /* renamed from: androidx.recyclerview.widget.l$h$a */
        /* compiled from: ItemTouchHelper */
        class C0896a implements ValueAnimator.AnimatorUpdateListener {
            C0896a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0895h.this.mo5354c(valueAnimator.getAnimatedFraction());
            }
        }

        C0895h(RecyclerView.C0792c0 c0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4019f = i2;
            this.f4018e = c0Var;
            this.f4014a = f;
            this.f4015b = f2;
            this.f4016c = f3;
            this.f4017d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f4020g = ofFloat;
            ofFloat.addUpdateListener(new C0896a());
            ofFloat.setTarget(c0Var.itemView);
            ofFloat.addListener(this);
            mo5354c(0.0f);
        }

        /* renamed from: a */
        public void mo5352a() {
            this.f4020g.cancel();
        }

        /* renamed from: b */
        public void mo5353b(long j) {
            this.f4020g.setDuration(j);
        }

        /* renamed from: c */
        public void mo5354c(float f) {
            this.f4026m = f;
        }

        /* renamed from: d */
        public void mo5355d() {
            this.f4018e.setIsRecyclable(false);
            this.f4020g.start();
        }

        /* renamed from: e */
        public void mo5356e() {
            float f = this.f4014a;
            float f2 = this.f4016c;
            if (f == f2) {
                this.f4022i = this.f4018e.itemView.getTranslationX();
            } else {
                this.f4022i = f + (this.f4026m * (f2 - f));
            }
            float f3 = this.f4015b;
            float f4 = this.f4017d;
            if (f3 == f4) {
                this.f4023j = this.f4018e.itemView.getTranslationY();
            } else {
                this.f4023j = f3 + (this.f4026m * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo5354c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4025l) {
                this.f4018e.setIsRecyclable(true);
            }
            this.f4025l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$i */
    /* compiled from: ItemTouchHelper */
    public interface C0897i {
        /* renamed from: b */
        void mo4488b(View view, View view2, int i, int i2);
    }

    public C0885l(C0891f fVar) {
        this.f3995s = fVar;
    }

    /* renamed from: D */
    private void m5465D() {
        this.f3999w = ViewConfiguration.get(this.f4000x.getContext()).getScaledTouchSlop();
        this.f4000x.mo4622h(this);
        this.f4000x.mo4633k(this.f3980H);
        this.f4000x.mo4631j(this);
        m5466F();
    }

    /* renamed from: F */
    private void m5466F() {
        this.f3979G = new C0894g();
        this.f3978F = new C3713d(this.f4000x.getContext(), this.f3979G);
    }

    /* renamed from: G */
    private void m5467G() {
        C0894g gVar = this.f3979G;
        if (gVar != null) {
            gVar.mo5349a();
            this.f3979G = null;
        }
        if (this.f3978F != null) {
            this.f3978F = null;
        }
    }

    /* renamed from: H */
    private int m5468H(RecyclerView.C0792c0 c0Var) {
        if (this.f3996t == 2) {
            return 0;
        }
        int movementFlags = this.f3995s.getMovementFlags(this.f4000x, c0Var);
        int convertToAbsoluteDirection = (this.f3995s.convertToAbsoluteDirection(movementFlags, C3774v.m16151B(this.f4000x)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f3990n) > Math.abs(this.f3991o)) {
            int k = m5470k(c0Var, convertToAbsoluteDirection);
            if (k > 0) {
                return (i & k) == 0 ? C0891f.convertToRelativeDirection(k, C3774v.m16151B(this.f4000x)) : k;
            }
            int m = m5471m(c0Var, convertToAbsoluteDirection);
            if (m > 0) {
                return m;
            }
        } else {
            int m2 = m5471m(c0Var, convertToAbsoluteDirection);
            if (m2 > 0) {
                return m2;
            }
            int k2 = m5470k(c0Var, convertToAbsoluteDirection);
            if (k2 > 0) {
                return (i & k2) == 0 ? C0891f.convertToRelativeDirection(k2, C3774v.m16151B(this.f4000x)) : k2;
            }
        }
        return 0;
    }

    /* renamed from: i */
    private void m5469i() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.f3975C == null) {
                this.f3975C = new C0890e();
            }
            this.f4000x.setChildDrawingOrderCallback(this.f3975C);
        }
    }

    /* renamed from: k */
    private int m5470k(RecyclerView.C0792c0 c0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.f3990n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f4002z;
        if (velocityTracker != null && this.f3994r > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3995s.getSwipeVelocityThreshold(this.f3989m));
            float xVelocity = this.f4002z.getXVelocity(this.f3994r);
            float yVelocity = this.f4002z.getYVelocity(this.f3994r);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.f3995s.getSwipeEscapeVelocity(this.f3988l) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.f4000x.getWidth()) * this.f3995s.getSwipeThreshold(c0Var);
        if ((i & i3) == 0 || Math.abs(this.f3990n) <= width) {
            return 0;
        }
        return i3;
    }

    /* renamed from: m */
    private int m5471m(RecyclerView.C0792c0 c0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f3991o > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f4002z;
        if (velocityTracker != null && this.f3994r > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3995s.getSwipeVelocityThreshold(this.f3989m));
            float xVelocity = this.f4002z.getXVelocity(this.f3994r);
            float yVelocity = this.f4002z.getYVelocity(this.f3994r);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.f3995s.getSwipeEscapeVelocity(this.f3988l) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.f4000x.getHeight()) * this.f3995s.getSwipeThreshold(c0Var);
        if ((i & i3) == 0 || Math.abs(this.f3991o) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: n */
    private void m5472n() {
        this.f4000x.mo4585d1(this);
        this.f4000x.mo4601g1(this.f3980H);
        this.f4000x.mo4598f1(this);
        for (int size = this.f3998v.size() - 1; size >= 0; size--) {
            C0895h hVar = this.f3998v.get(0);
            hVar.mo5352a();
            this.f3995s.clearView(this.f4000x, hVar.f4018e);
        }
        this.f3998v.clear();
        this.f3976D = null;
        this.f3977E = -1;
        m5477z();
        m5467G();
    }

    /* renamed from: r */
    private List<RecyclerView.C0792c0> m5473r(RecyclerView.C0792c0 c0Var) {
        RecyclerView.C0792c0 c0Var2 = c0Var;
        List<RecyclerView.C0792c0> list = this.f3973A;
        if (list == null) {
            this.f3973A = new ArrayList();
            this.f3974B = new ArrayList();
        } else {
            list.clear();
            this.f3974B.clear();
        }
        int boundingBoxMargin = this.f3995s.getBoundingBoxMargin();
        int round = Math.round(this.f3992p + this.f3990n) - boundingBoxMargin;
        int round2 = Math.round(this.f3993q + this.f3991o) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = c0Var2.itemView.getWidth() + round + i;
        int height = c0Var2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.C0809p layoutManager = this.f4000x.getLayoutManager();
        int K = layoutManager.mo4901K();
        int i4 = 0;
        while (i4 < K) {
            View J = layoutManager.mo4900J(i4);
            if (J != c0Var2.itemView && J.getBottom() >= round2 && J.getTop() <= height && J.getRight() >= round && J.getLeft() <= width) {
                RecyclerView.C0792c0 j0 = this.f4000x.mo4632j0(J);
                if (this.f3995s.canDropOver(this.f4000x, this.f3985i, j0)) {
                    int abs = Math.abs(i2 - ((J.getLeft() + J.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((J.getTop() + J.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f3973A.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.f3974B.get(i6).intValue()) {
                        i7++;
                        i6++;
                        RecyclerView.C0792c0 c0Var3 = c0Var;
                    }
                    this.f3973A.add(i7, j0);
                    this.f3974B.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            c0Var2 = c0Var;
        }
        return this.f3973A;
    }

    /* renamed from: s */
    private RecyclerView.C0792c0 m5474s(MotionEvent motionEvent) {
        View q;
        RecyclerView.C0809p layoutManager = this.f4000x.getLayoutManager();
        int i = this.f3994r;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f3986j);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f3987k);
        int i2 = this.f3999w;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo4495l()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo4496m()) && (q = mo5314q(motionEvent)) != null) {
            return this.f4000x.mo4632j0(q);
        }
        return null;
    }

    /* renamed from: t */
    private void m5475t(float[] fArr) {
        if ((this.f3997u & 12) != 0) {
            fArr[0] = (this.f3992p + this.f3990n) - ((float) this.f3985i.itemView.getLeft());
        } else {
            fArr[0] = this.f3985i.itemView.getTranslationX();
        }
        if ((this.f3997u & 3) != 0) {
            fArr[1] = (this.f3993q + this.f3991o) - ((float) this.f3985i.itemView.getTop());
        } else {
            fArr[1] = this.f3985i.itemView.getTranslationY();
        }
    }

    /* renamed from: v */
    private static boolean m5476v(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: z */
    private void m5477z() {
        VelocityTracker velocityTracker = this.f4002z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4002z = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5305A(View view) {
        if (view == this.f3976D) {
            this.f3976D = null;
            if (this.f3975C != null) {
                this.f4000x.setChildDrawingOrderCallback((RecyclerView.C0801k) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5306B() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$c0 r1 = r0.f3985i
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f3982J = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f3982J
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f4000x
            androidx.recyclerview.widget.RecyclerView$p r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f3981I
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f3981I = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$c0 r9 = r0.f3985i
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f3981I
            r1.mo4945k(r9, r10)
            boolean r9 = r1.mo4495l()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f3992p
            float r11 = r0.f3990n
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f3981I
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f4000x
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f3990n
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$c0 r11 = r0.f3985i
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f3981I
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f4000x
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f4000x
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = 0
        L_0x007e:
            boolean r1 = r1.mo4496m()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f3993q
            float r9 = r0.f3991o
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f3981I
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f4000x
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f3991o
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$c0 r9 = r0.f3985i
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f3981I
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f4000x
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f4000x
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.l$f r9 = r0.f3995s
            androidx.recyclerview.widget.RecyclerView r10 = r0.f4000x
            androidx.recyclerview.widget.RecyclerView$c0 r11 = r0.f3985i
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f4000x
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.l$f r9 = r0.f3995s
            androidx.recyclerview.widget.RecyclerView r10 = r0.f4000x
            androidx.recyclerview.widget.RecyclerView$c0 r11 = r0.f3985i
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f4000x
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.f3982J = r3
            return r2
        L_0x0106:
            long r7 = r0.f3982J
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.f3982J = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f4000x
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0885l.mo5306B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5307C(androidx.recyclerview.widget.RecyclerView.C0792c0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.f3985i
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f3996t
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f3982J = r0
            int r4 = r11.f3996t
            r14 = 1
            r11.mo5312o(r12, r14)
            r11.f3996t = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f3976D = r0
            r23.m5469i()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$c0 r9 = r11.f3985i
            r8 = 0
            if (r9 == 0) goto L_0x00ee
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00da
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.m5468H(r9)
            r7 = r0
        L_0x004f:
            r23.m5477z()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007b
            if (r7 == r15) goto L_0x007b
            if (r7 == r0) goto L_0x0067
            if (r7 == r10) goto L_0x0067
            r2 = 16
            if (r7 == r2) goto L_0x0067
            r2 = 32
            if (r7 == r2) goto L_0x0067
            r17 = 0
            goto L_0x0078
        L_0x0067:
            float r2 = r11.f3990n
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f4000x
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
        L_0x0078:
            r18 = 0
            goto L_0x008e
        L_0x007b:
            float r2 = r11.f3991o
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f4000x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x008e:
            if (r4 != r15) goto L_0x0093
            r6 = 8
            goto L_0x0098
        L_0x0093:
            if (r7 <= 0) goto L_0x0097
            r6 = 2
            goto L_0x0098
        L_0x0097:
            r6 = 4
        L_0x0098:
            float[] r0 = r11.f3984h
            r11.m5475t(r0)
            float[] r0 = r11.f3984h
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.l$c r5 = new androidx.recyclerview.widget.l$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.l$f r0 = r11.f3995s
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4000x
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            r14.mo5353b(r0)
            java.util.List<androidx.recyclerview.widget.l$h> r0 = r11.f3998v
            r0.add(r14)
            r14.mo5355d()
            r8 = 1
            goto L_0x00ea
        L_0x00da:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo5305A(r1)
            androidx.recyclerview.widget.l$f r1 = r11.f3995s
            androidx.recyclerview.widget.RecyclerView r2 = r11.f4000x
            r1.clearView(r2, r0)
            r8 = 0
        L_0x00ea:
            r0 = 0
            r11.f3985i = r0
            goto L_0x00f1
        L_0x00ee:
            r21 = 8
            r8 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0122
            androidx.recyclerview.widget.l$f r0 = r11.f3995s
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4000x
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f3996t
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f3997u = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f3992p = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f3993q = r0
            r11.f3985i = r12
            r0 = 2
            if (r13 != r0) goto L_0x0122
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0123
        L_0x0122:
            r1 = 0
        L_0x0123:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4000x
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0135
            androidx.recyclerview.widget.RecyclerView$c0 r2 = r11.f3985i
            if (r2 == 0) goto L_0x0131
            r14 = 1
            goto L_0x0132
        L_0x0131:
            r14 = 0
        L_0x0132:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0135:
            if (r8 != 0) goto L_0x0140
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4000x
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getLayoutManager()
            r0.mo4966v1()
        L_0x0140:
            androidx.recyclerview.widget.l$f r0 = r11.f3995s
            androidx.recyclerview.widget.RecyclerView$c0 r1 = r11.f3985i
            int r2 = r11.f3996t
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f4000x
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0885l.mo5307C(androidx.recyclerview.widget.RecyclerView$c0, int):void");
    }

    /* renamed from: E */
    public void mo5308E(RecyclerView.C0792c0 c0Var) {
        if (!this.f3995s.hasDragFlag(this.f4000x, c0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (c0Var.itemView.getParent() != this.f4000x) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            mo5317x();
            this.f3991o = 0.0f;
            this.f3990n = 0.0f;
            mo5307C(c0Var, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo5309I(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f3986j;
        this.f3990n = f;
        this.f3991o = y - this.f3987k;
        if ((i & 4) == 0) {
            this.f3990n = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f3990n = Math.min(0.0f, this.f3990n);
        }
        if ((i & 1) == 0) {
            this.f3991o = Math.max(0.0f, this.f3991o);
        }
        if ((i & 2) == 0) {
            this.f3991o = Math.min(0.0f, this.f3991o);
        }
    }

    /* renamed from: a */
    public void mo4978a(View view) {
        mo5305A(view);
        RecyclerView.C0792c0 j0 = this.f4000x.mo4632j0(view);
        if (j0 != null) {
            RecyclerView.C0792c0 c0Var = this.f3985i;
            if (c0Var == null || j0 != c0Var) {
                mo5312o(j0, false);
                if (this.f3983g.remove(j0.itemView)) {
                    this.f3995s.clearView(this.f4000x, j0);
                    return;
                }
                return;
            }
            mo5307C((RecyclerView.C0792c0) null, 0);
        }
    }

    /* renamed from: b */
    public void mo4979b(View view) {
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        rect.setEmpty();
    }

    /* renamed from: f */
    public void mo4876f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        float f;
        float f2;
        this.f3977E = -1;
        if (this.f3985i != null) {
            m5475t(this.f3984h);
            float[] fArr = this.f3984h;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f3995s.onDraw(canvas, recyclerView, this.f3985i, this.f3998v, this.f3996t, f2, f);
    }

    /* renamed from: h */
    public void mo4878h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        float f;
        float f2;
        if (this.f3985i != null) {
            m5475t(this.f3984h);
            float[] fArr = this.f3984h;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f3995s.onDrawOver(canvas, recyclerView, this.f3985i, this.f3998v, this.f3996t, f2, f);
    }

    /* renamed from: j */
    public void mo5310j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4000x;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5472n();
            }
            this.f4000x = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f3988l = resources.getDimension(C4133b.item_touch_helper_swipe_escape_velocity);
                this.f3989m = resources.getDimension(C4133b.item_touch_helper_swipe_escape_max_velocity);
                m5465D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5311l(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.C0792c0 s;
        int absoluteMovementFlags;
        if (this.f3985i == null && i == 2 && this.f3996t != 2 && this.f3995s.isItemViewSwipeEnabled() && this.f4000x.getScrollState() != 1 && (s = m5474s(motionEvent)) != null && (absoluteMovementFlags = (this.f3995s.getAbsoluteMovementFlags(this.f4000x, s) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.f3986j;
            float f2 = y - this.f3987k;
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            int i3 = this.f3999w;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                        return;
                    }
                    if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                        return;
                    }
                } else if (f2 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                } else {
                    if (f2 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                        return;
                    }
                }
                this.f3991o = 0.0f;
                this.f3990n = 0.0f;
                this.f3994r = motionEvent.getPointerId(0);
                mo5307C(s, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5312o(RecyclerView.C0792c0 c0Var, boolean z) {
        for (int size = this.f3998v.size() - 1; size >= 0; size--) {
            C0895h hVar = this.f3998v.get(size);
            if (hVar.f4018e == c0Var) {
                hVar.f4024k |= z;
                if (!hVar.f4025l) {
                    hVar.mo5352a();
                }
                this.f3998v.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0895h mo5313p(MotionEvent motionEvent) {
        if (this.f3998v.isEmpty()) {
            return null;
        }
        View q = mo5314q(motionEvent);
        for (int size = this.f3998v.size() - 1; size >= 0; size--) {
            C0895h hVar = this.f3998v.get(size);
            if (hVar.f4018e.itemView == q) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public View mo5314q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C0792c0 c0Var = this.f3985i;
        if (c0Var != null) {
            View view = c0Var.itemView;
            if (m5476v(view, x, y, this.f3992p + this.f3990n, this.f3993q + this.f3991o)) {
                return view;
            }
        }
        for (int size = this.f3998v.size() - 1; size >= 0; size--) {
            C0895h hVar = this.f3998v.get(size);
            View view2 = hVar.f4018e.itemView;
            if (m5476v(view2, x, y, hVar.f4022i, hVar.f4023j)) {
                return view2;
            }
        }
        return this.f4000x.mo4562S(x, y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5315u() {
        int size = this.f3998v.size();
        for (int i = 0; i < size; i++) {
            if (!this.f3998v.get(i).f4025l) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5316w(RecyclerView.C0792c0 c0Var) {
        if (!this.f4000x.isLayoutRequested() && this.f3996t == 2) {
            float moveThreshold = this.f3995s.getMoveThreshold(c0Var);
            int i = (int) (this.f3992p + this.f3990n);
            int i2 = (int) (this.f3993q + this.f3991o);
            if (((float) Math.abs(i2 - c0Var.itemView.getTop())) >= ((float) c0Var.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i - c0Var.itemView.getLeft())) >= ((float) c0Var.itemView.getWidth()) * moveThreshold) {
                List<RecyclerView.C0792c0> r = m5473r(c0Var);
                if (r.size() != 0) {
                    RecyclerView.C0792c0 chooseDropTarget = this.f3995s.chooseDropTarget(c0Var, r, i, i2);
                    if (chooseDropTarget == null) {
                        this.f3973A.clear();
                        this.f3974B.clear();
                        return;
                    }
                    int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = c0Var.getAbsoluteAdapterPosition();
                    if (this.f3995s.onMove(this.f4000x, c0Var, chooseDropTarget)) {
                        this.f3995s.onMoved(this.f4000x, c0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5317x() {
        VelocityTracker velocityTracker = this.f4002z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4002z = VelocityTracker.obtain();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5318y(C0895h hVar, int i) {
        this.f4000x.post(new C0889d(hVar, i));
    }
}
