package com.p256kk.taurus.playerbase.p266j;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.j.a */
/* compiled from: BaseGestureCallbackHandler */
public class C6693a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    protected C6695c f30091a;

    /* renamed from: b */
    private boolean f30092b = true;

    /* renamed from: c */
    private boolean f30093c = true;

    public C6693a(C6695c cVar) {
        this.f30091a = cVar;
    }

    /* renamed from: a */
    public void mo26047a(MotionEvent motionEvent) {
        C6695c cVar = this.f30091a;
        if (cVar != null) {
            cVar.mo10273n();
        }
    }

    /* renamed from: b */
    public void mo26048b(boolean z) {
        this.f30092b = z;
    }

    /* renamed from: c */
    public void mo26049c(boolean z) {
        this.f30093c = z;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C6695c cVar = this.f30091a;
        if (cVar != null) {
            cVar.onDoubleTap(motionEvent);
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        C6640b.m38216a("GestureCallbackHandler", "onDown...");
        C6695c cVar = this.f30091a;
        if (cVar != null) {
            cVar.onDown(motionEvent);
        }
        return this.f30092b;
    }

    public void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        C6695c cVar = this.f30091a;
        if (cVar != null) {
            cVar.onLongPress(motionEvent);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6695c cVar = this.f30091a;
        if (cVar != null && this.f30093c) {
            cVar.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C6695c cVar = this.f30091a;
        if (cVar != null) {
            cVar.onSingleTapConfirmed(motionEvent);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
