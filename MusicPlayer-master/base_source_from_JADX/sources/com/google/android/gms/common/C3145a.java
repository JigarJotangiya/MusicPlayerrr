package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3145a implements ServiceConnection {

    /* renamed from: g */
    boolean f10310g = false;

    /* renamed from: h */
    private final BlockingQueue<IBinder> f10311h = new LinkedBlockingQueue();

    @RecentlyNonNull
    /* renamed from: a */
    public IBinder mo11470a(long j, @RecentlyNonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C3292l.m14239g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f10310g) {
            this.f10310g = true;
            IBinder poll = this.f10311h.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f10311h.add(iBinder);
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
