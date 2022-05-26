package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
/* compiled from: AnimateLayoutChangeDetector */
final class C1214a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f4954b;

    /* renamed from: a */
    private LinearLayoutManager f4955a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    /* compiled from: AnimateLayoutChangeDetector */
    class C1215a implements Comparator<int[]> {
        C1215a(C1214a aVar) {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f4954b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C1214a(LinearLayoutManager linearLayoutManager) {
        this.f4955a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m6796a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int K = this.f4955a.mo4901K();
        if (K == 0) {
            return true;
        }
        boolean z = this.f4955a.mo4498n2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = K;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < K) {
            View J = this.f4955a.mo4900J(i5);
            if (J != null) {
                ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f4954b;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = J.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = J.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = J.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = J.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C1215a(this));
        for (int i6 = 1; i6 < K; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int i7 = iArr2[0][1] - iArr2[0][0];
        if (iArr2[0][0] > 0 || iArr2[K - 1][1] < i7) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m6797b() {
        int K = this.f4955a.mo4901K();
        for (int i = 0; i < K; i++) {
            if (m6798c(this.f4955a.mo4900J(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m6798c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m6798c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6394d() {
        if ((!m6796a() || this.f4955a.mo4901K() <= 1) && m6797b()) {
            return true;
        }
        return false;
    }
}
