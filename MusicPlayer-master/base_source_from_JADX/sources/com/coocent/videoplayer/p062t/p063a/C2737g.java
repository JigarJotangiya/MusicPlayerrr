package com.coocent.videoplayer.p062t.p063a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.gesture.GestureOverlayView;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.p060r.C2719i;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p263g.C6660b;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p266j.C6695c;
import java.io.Serializable;
import java.util.Objects;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.a.g */
/* compiled from: WindowControllerCover.kt */
public final class C2737g extends C6660b implements View.OnClickListener, GestureOverlayView.OnGestureListener, C6695c {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2719i f9404l;

    /* renamed from: m */
    private ObjectAnimator f9405m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int f9406n = 2;

    /* renamed from: o */
    private int f9407o;

    /* renamed from: p */
    private final Handler f9408p = new C2738a(this, Looper.getMainLooper());

    /* renamed from: q */
    private final C2739b f9409q = new C2739b(this);

    /* renamed from: com.coocent.videoplayer.t.a.g$a */
    /* compiled from: WindowControllerCover.kt */
    public static final class C2738a extends Handler {

        /* renamed from: a */
        final /* synthetic */ C2737g f9410a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2738a(C2737g gVar, Looper looper) {
            super(looper);
            this.f9410a = gVar;
        }

        public void handleMessage(Message message) {
            C8594l.m46771e(message, "msg");
            super.handleMessage(message);
            if (message.what == this.f9410a.f9406n) {
                this.f9410a.m12390Z(false);
            }
        }
    }

    /* renamed from: com.coocent.videoplayer.t.a.g$b */
    /* compiled from: WindowControllerCover.kt */
    public static final class C2739b implements C6668j.C6669a {

        /* renamed from: a */
        final /* synthetic */ C2737g f9411a;

        C2739b(C2737g gVar) {
            this.f9411a = gVar;
        }

        /* renamed from: a */
        public void mo10289a(String str, Object obj) {
            if (TextUtils.equals(str, ConsantsKt.KEY_DATA_SOURCE)) {
                if (obj != null) {
                    C2737g gVar = this.f9411a;
                    if (obj instanceof C6618a) {
                        gVar.m12392b0((C6618a) obj);
                    }
                }
            } else if (TextUtils.equals(str, "playing")) {
                C2719i Q = this.f9411a.f9404l;
                if (Q != null) {
                    AppCompatImageView appCompatImageView = Q.f9359e;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    appCompatImageView.setSelected(!((Boolean) obj).booleanValue());
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            } else if (TextUtils.equals(str, "show_forward_rewind")) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C2719i Q2 = this.f9411a.f9404l;
                if (Q2 != null) {
                    AppCompatImageView appCompatImageView2 = Q2.f9360f;
                    C8594l.m46770d(appCompatImageView2, "ivPrevious");
                    int i = 0;
                    appCompatImageView2.setVisibility(booleanValue ^ true ? 0 : 8);
                    AppCompatImageView appCompatImageView3 = Q2.f9358d;
                    C8594l.m46770d(appCompatImageView3, "ivNext");
                    if (!(!booleanValue)) {
                        i = 8;
                    }
                    appCompatImageView3.setVisibility(i);
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }

        /* renamed from: b */
        public String[] mo10290b() {
            return new String[]{ConsantsKt.KEY_DATA_SOURCE, "playing"};
        }
    }

    /* renamed from: com.coocent.videoplayer.t.a.g$c */
    /* compiled from: WindowControllerCover.kt */
    public static final class C2740c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final Bundle f9412a = C6621a.m38175a();

        /* renamed from: b */
        final /* synthetic */ boolean f9413b;

        /* renamed from: c */
        final /* synthetic */ C2737g f9414c;

        C2740c(boolean z, C2737g gVar) {
            this.f9413b = z;
            this.f9414c = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f9413b) {
                C2719i Q = this.f9414c.f9404l;
                if (Q != null) {
                    Q.f9356b.setVisibility(8);
                    this.f9412a.putBoolean("bool_data", false);
                    this.f9414c.mo25996z(1016, this.f9412a);
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f9413b) {
                C2719i Q = this.f9414c.f9404l;
                if (Q != null) {
                    Q.f9356b.setVisibility(0);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2737g(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
    }

    /* renamed from: V */
    private final void m12386V() {
        ObjectAnimator objectAnimator = this.f9405m;
        if (objectAnimator != null) {
            C8594l.m46769c(objectAnimator);
            objectAnimator.cancel();
            ObjectAnimator objectAnimator2 = this.f9405m;
            C8594l.m46769c(objectAnimator2);
            objectAnimator2.removeAllListeners();
            ObjectAnimator objectAnimator3 = this.f9405m;
            C8594l.m46769c(objectAnimator3);
            objectAnimator3.removeAllUpdateListeners();
        }
    }

    /* renamed from: W */
    private final void m12387W() {
        C2719i iVar = this.f9404l;
        if (iVar != null) {
            boolean isSelected = iVar.f9359e.isSelected();
            if (isSelected) {
                mo25979M((Bundle) null);
            } else {
                mo25978L((Bundle) null);
            }
            C2719i iVar2 = this.f9404l;
            if (iVar2 != null) {
                iVar2.f9359e.setSelected(!isSelected);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static final boolean m12389Y(C2737g gVar, View view, MotionEvent motionEvent) {
        C8594l.m46771e(gVar, "this$0");
        C8594l.m46771e(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            gVar.f9407o = (int) motionEvent.getRawX();
            gVar.mo25996z(1018, (Bundle) null);
        } else if (action == 1) {
            gVar.mo25996z(1019, (Bundle) null);
        } else if (action == 2) {
            Bundle a = C6621a.m38175a();
            a.putInt("resize_x", (int) (motionEvent.getRawX() - ((float) gVar.f9407o)));
            gVar.mo25996z(1018, a);
            gVar.f9407o = (int) motionEvent.getRawX();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public final void m12390Z(boolean z) {
        if (z) {
            this.f9408p.removeMessages(this.f9406n);
            this.f9408p.sendEmptyMessageDelayed(this.f9406n, 3000);
        } else {
            this.f9408p.removeMessages(this.f9406n);
        }
        m12391a0(z);
    }

    /* renamed from: a0 */
    private final void m12391a0(boolean z) {
        C2719i iVar = this.f9404l;
        if (iVar != null) {
            iVar.f9356b.clearAnimation();
            m12386V();
            C2719i iVar2 = this.f9404l;
            if (iVar2 != null) {
                ConstraintLayout constraintLayout = iVar2.f9356b;
                float[] fArr = new float[2];
                float f = 0.0f;
                fArr[0] = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                fArr[1] = f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", fArr).setDuration(300);
                duration.addListener(new C2740c(z, this));
                duration.start();
                C8457t tVar = C8457t.f34900a;
                this.f9405m = duration;
                if (z) {
                    mo25977K();
                } else {
                    mo25981O();
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m12392b0(C6618a aVar) {
        Cursor query;
        int columnIndex;
        if (aVar != null) {
            String title = aVar.getTitle();
            if (!TextUtils.isEmpty(title)) {
                C2719i iVar = this.f9404l;
                if (iVar != null) {
                    iVar.f9363i.setText(title);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                Uri uri = aVar.getUri();
                if (uri != null) {
                    String scheme = uri.getScheme();
                    if (scheme == null) {
                        title = uri.getPath();
                    } else if (C8594l.m46767a("file", scheme)) {
                        title = uri.getLastPathSegment();
                    } else if (C8594l.m46767a("content", scheme) && (query = mo25993w().getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null)) != null) {
                        if (!query.isClosed() && query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) > -1) {
                            title = query.getString(columnIndex);
                        }
                        query.close();
                    }
                    if (title != null) {
                        C2719i iVar2 = this.f9404l;
                        if (iVar2 != null) {
                            iVar2.f9363i.setText(title);
                            return;
                        } else {
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                    }
                }
                if (!TextUtils.isEmpty(aVar.getData())) {
                    C2719i iVar3 = this.f9404l;
                    if (iVar3 != null) {
                        iVar3.f9363i.setText(aVar.getData());
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo10267H() {
        super.mo10267H();
        C6618a aVar = (C6618a) mo25994x().mo25999d(ConsantsKt.KEY_DATA_SOURCE);
        if (aVar != null) {
            m12392b0(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo10268I() {
        super.mo10268I();
        C2719i iVar = this.f9404l;
        if (iVar != null) {
            iVar.f9356b.setVisibility(8);
            this.f9408p.removeMessages(this.f9406n);
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public View mo10269J(Context context) {
        C8594l.m46771e(context, "context");
        C2719i d = C2719i.m12304d(LayoutInflater.from(context), (ViewGroup) null, false);
        C8594l.m46770d(d, "it");
        this.f9404l = d;
        ConstraintLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(\n            Lay…nding = it\n        }.root");
        return c;
    }

    /* renamed from: a */
    public void mo10270a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo10271b(int i, Bundle bundle) {
        Integer num;
        Serializable serializable = null;
        if (i == -99031) {
            if (bundle == null) {
                num = null;
            } else {
                num = Integer.valueOf(bundle.getInt("int_data"));
            }
            if (num != null && num.intValue() == 4) {
                C2719i iVar = this.f9404l;
                if (iVar != null) {
                    iVar.f9359e.setSelected(true);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else if (num != null && num.intValue() == 3) {
                C2719i iVar2 = this.f9404l;
                if (iVar2 != null) {
                    iVar2.f9359e.setSelected(false);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            }
        } else if (i == -99001) {
            if (bundle != null) {
                serializable = bundle.getSerializable("serializable_data");
            }
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kk.taurus.playerbase.entity.DataSource");
            m12392b0((C6618a) serializable);
        }
    }

    /* renamed from: d */
    public void mo10272d(int i, Bundle bundle) {
    }

    /* renamed from: n */
    public void mo10273n() {
    }

    public void onClick(View view) {
        C8594l.m46771e(view, "v");
        int id = view.getId();
        if (id == C2706m.iv_close) {
            mo25996z(1021, (Bundle) null);
        } else if (id == C2706m.iv_previous) {
            mo25996z(1011, (Bundle) null);
        } else if (id == C2706m.iv_play) {
            m12387W();
        } else if (id == C2706m.iv_next) {
            mo25996z(1012, (Bundle) null);
        } else if (id == C2706m.iv_restore) {
            mo25996z(1020, (Bundle) null);
        }
    }

    public void onDoubleTap(MotionEvent motionEvent) {
        m12387W();
    }

    public void onDown(MotionEvent motionEvent) {
    }

    public void onGesture(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        C8594l.m46771e(gestureOverlayView, "overlay");
        C8594l.m46771e(motionEvent, "event");
    }

    public void onGestureCancelled(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        C8594l.m46771e(gestureOverlayView, "overlay");
        C8594l.m46771e(motionEvent, "event");
    }

    public void onGestureEnded(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        C8594l.m46771e(gestureOverlayView, "overlay");
        C8594l.m46771e(motionEvent, "event");
    }

    public void onGestureStarted(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        C8594l.m46771e(gestureOverlayView, "overlay");
        C8594l.m46771e(motionEvent, "event");
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void onSingleTapConfirmed(MotionEvent motionEvent) {
        C2719i iVar = this.f9404l;
        if (iVar == null) {
            C8594l.m46783q("mBinding");
            throw null;
        } else if (iVar.f9356b.getVisibility() == 0) {
            m12390Z(false);
        } else {
            m12390Z(true);
        }
    }

    /* renamed from: p */
    public void mo10283p() {
        super.mo10283p();
        m12386V();
        mo25994x().mo26004k(this.f9409q);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: t */
    public void mo10284t() {
        super.mo10284t();
        C2719i iVar = this.f9404l;
        if (iVar != null) {
            iVar.f9359e.setOnClickListener(this);
            C2719i iVar2 = this.f9404l;
            if (iVar2 != null) {
                iVar2.f9357c.setOnClickListener(this);
                C2719i iVar3 = this.f9404l;
                if (iVar3 != null) {
                    iVar3.f9360f.setOnClickListener(this);
                    C2719i iVar4 = this.f9404l;
                    if (iVar4 != null) {
                        iVar4.f9358d.setOnClickListener(this);
                        C2719i iVar5 = this.f9404l;
                        if (iVar5 != null) {
                            iVar5.f9362h.setOnClickListener(this);
                            C2719i iVar6 = this.f9404l;
                            if (iVar6 != null) {
                                iVar6.f9361g.setOnTouchListener(new C2728c(this));
                                mo25994x().mo26003j(this.f9409q);
                                this.f9408p.sendEmptyMessage(this.f9406n);
                                return;
                            }
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }
}
