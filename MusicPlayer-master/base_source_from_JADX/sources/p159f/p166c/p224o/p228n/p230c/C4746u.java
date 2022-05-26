package p159f.p166c.p224o.p228n.p230c;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0584b;
import com.coocent.videolibrary.widget.view.FixedCursorEditText;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4628j;
import p159f.p166c.p224o.p225k.C4637i;
import p159f.p166c.p224o.p226l.C4661k;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p228n.C4711a;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.o.n.c.u */
/* compiled from: SearchDialog.kt */
public final class C4746u extends C0584b implements View.OnClickListener, DialogInterface.OnKeyListener, ViewTreeObserver.OnPreDrawListener, C4711a.C4713b {

    /* renamed from: t0 */
    public static final C4747a f13556t0 = new C4747a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final String f13557u0 = C4746u.class.getCanonicalName();

    /* renamed from: q0 */
    private C4637i f13558q0;

    /* renamed from: r0 */
    private C4711a f13559r0;

    /* renamed from: s0 */
    private C4748b f13560s0;

    /* renamed from: f.c.o.n.c.u$a */
    /* compiled from: SearchDialog.kt */
    public static final class C4747a {
        private C4747a() {
        }

        public /* synthetic */ C4747a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo15472a() {
            return C4746u.f13557u0;
        }
    }

    /* renamed from: f.c.o.n.c.u$b */
    /* compiled from: SearchDialog.kt */
    public interface C4748b {
        /* renamed from: a */
        void mo15467a(String str);
    }

    /* renamed from: j3 */
    private final void m20300j3() {
        C4661k kVar = C4661k.f13447a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C4637i iVar = this.f13558q0;
        if (iVar != null) {
            kVar.mo15392a(v2, iVar.f13387b);
            C4711a aVar = this.f13559r0;
            if (aVar != null) {
                C4637i iVar2 = this.f13558q0;
                if (iVar2 != null) {
                    AppCompatImageView appCompatImageView = iVar2.f13389d;
                    if (iVar2 != null) {
                        aVar.mo15432c(appCompatImageView, iVar2.mo7577a());
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mAnimator");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final boolean m20302l3(C4746u uVar, View view, MotionEvent motionEvent) {
        Window window;
        C8594l.m46771e(uVar, "this$0");
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C4661k kVar = C4661k.f13447a;
            Context v2 = uVar.mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            Dialog a3 = uVar.mo3834a3();
            View view2 = null;
            if (!(a3 == null || (window = a3.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            kVar.mo15392a(v2, view2);
        }
        return false;
    }

    /* renamed from: m3 */
    private final void m20303m3() {
        C4637i iVar = this.f13558q0;
        if (iVar != null) {
            String valueOf = String.valueOf(iVar.f13387b.getText());
            C4748b bVar = this.f13560s0;
            if (bVar != null) {
                bVar.mo15467a(valueOf);
            }
            m20300j3();
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: F1 */
    public void mo3589F1(boolean z) {
        super.mo3589F1(z);
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        Window window;
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            window.setLayout(mo3698s0().getDisplayMetrics().widthPixels, -2);
            window.setGravity(48);
            window.setWindowAnimations(C4628j.VideoTheme_SearchDialog_Animation);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        Window window;
        View decorView;
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        C4637i iVar = this.f13558q0;
        if (iVar != null) {
            iVar.f13387b.requestFocus();
            C4711a aVar = new C4711a();
            this.f13559r0 = aVar;
            if (aVar != null) {
                aVar.mo15433d(this);
                Dialog a3 = mo3834a3();
                if (a3 != null) {
                    a3.setOnKeyListener(this);
                }
                C4637i iVar2 = this.f13558q0;
                if (iVar2 != null) {
                    iVar2.f13389d.getViewTreeObserver().addOnPreDrawListener(this);
                    Dialog a32 = mo3834a3();
                    if (!(a32 == null || (window = a32.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                        decorView.setOnTouchListener(new C4731q(this));
                    }
                    C4637i iVar3 = this.f13558q0;
                    if (iVar3 != null) {
                        iVar3.f13388c.setOnClickListener(this);
                        C4637i iVar4 = this.f13558q0;
                        if (iVar4 != null) {
                            iVar4.f13389d.setOnClickListener(this);
                        } else {
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mAnimator");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        C4668q.C4669a aVar = C4668q.f13454a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        mo3839f3(2, aVar.mo15400c(v2));
    }

    /* renamed from: n3 */
    public final void mo15468n3(C4748b bVar) {
        C8594l.m46771e(bVar, "listener");
        this.f13560s0 = bVar;
    }

    /* renamed from: o */
    public void mo15436o() {
        C4637i iVar = this.f13558q0;
        if (iVar != null) {
            iVar.f13387b.setText(BuildConfig.FLAVOR);
            mo3832Y2();
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    public void onClick(View view) {
        Integer valueOf = view == null ? null : Integer.valueOf(view.getId());
        int i = C4623e.iv_back;
        if (valueOf != null && valueOf.intValue() == i) {
            m20300j3();
            return;
        }
        int i2 = C4623e.iv_search;
        if (valueOf != null && valueOf.intValue() == i2) {
            m20303m3();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C8594l.m46771e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                m20300j3();
                return false;
            }
        }
        if (i == 66) {
            if (keyEvent == null || keyEvent.getAction() != 0) {
                z = false;
            }
            if (z) {
                m20303m3();
            }
        }
        return false;
    }

    public boolean onPreDraw() {
        C4637i iVar = this.f13558q0;
        if (iVar != null) {
            iVar.f13389d.getViewTreeObserver().removeOnPreDrawListener(this);
            C4711a aVar = this.f13559r0;
            if (aVar != null) {
                C4637i iVar2 = this.f13558q0;
                if (iVar2 != null) {
                    AppCompatImageView appCompatImageView = iVar2.f13389d;
                    if (iVar2 != null) {
                        aVar.mo15434e(appCompatImageView, iVar2.mo7577a());
                        return true;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mAnimator");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: t */
    public void mo15437t() {
        if (mo3652a1()) {
            C4661k kVar = C4661k.f13447a;
            Context v2 = mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            C4637i iVar = this.f13558q0;
            if (iVar != null) {
                FixedCursorEditText fixedCursorEditText = iVar.f13387b;
                C8594l.m46770d(fixedCursorEditText, "mBinding.etSearch");
                kVar.mo15393b(v2, fixedCursorEditText);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8594l.m46771e(layoutInflater, "inflater");
        C4637i d = C4637i.m20116d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f13558q0 = d;
        ConstraintLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }
}
