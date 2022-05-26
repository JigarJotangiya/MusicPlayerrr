package com.p256kk.taurus.playerbase.p266j;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.kk.taurus.playerbase.j.b */
/* compiled from: ContainerTouchHelper */
public class C6694b {

    /* renamed from: a */
    private GestureDetector f30094a;

    /* renamed from: b */
    private C6693a f30095b;

    public C6694b(Context context, C6693a aVar) {
        this.f30095b = aVar;
        this.f30094a = new GestureDetector(context, aVar);
    }

    /* renamed from: a */
    public void mo26055a(MotionEvent motionEvent) {
        this.f30095b.mo26047a(motionEvent);
    }

    /* renamed from: b */
    public boolean mo26056b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo26055a(motionEvent);
        }
        return this.f30094a.onTouchEvent(motionEvent);
    }

    /* renamed from: c */
    public void mo26057c(boolean z) {
        this.f30095b.mo26048b(z);
    }

    /* renamed from: d */
    public void mo26058d(boolean z) {
        this.f30095b.mo26049c(z);
    }
}
