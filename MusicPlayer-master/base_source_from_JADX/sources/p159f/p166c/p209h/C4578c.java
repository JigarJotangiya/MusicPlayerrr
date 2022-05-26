package p159f.p166c.p209h;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import p159f.p166c.p209h.C4576b;

/* renamed from: f.c.h.c */
/* compiled from: MusicMasterManager */
public class C4578c extends C4576b {

    /* renamed from: a */
    private Thread f13284a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ServiceConnection f13285b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13286c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4576b.C4577a f13287d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Messenger f13288e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Messenger f13289f = new Messenger(new C4581c(this, (C4579a) null));

    /* renamed from: g */
    private BroadcastReceiver f13290g = new C4579a();

    /* renamed from: f.c.h.c$a */
    /* compiled from: MusicMasterManager */
    class C4579a extends BroadcastReceiver {
        C4579a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && TextUtils.equals(intent.getAction(), "coocent_eq_ask_music_bind_eq_service")) {
                boolean booleanExtra = intent.getBooleanExtra("bind", false);
                C4575a.m19988b("isBind=" + booleanExtra);
                ComponentName componentName = null;
                if (booleanExtra) {
                    boolean booleanExtra2 = intent.getBooleanExtra("initiative", true);
                    C4575a.m19988b("initiative=" + booleanExtra2);
                    if (!booleanExtra2 && C4578c.this.f13287d != null) {
                        C4578c.this.f13287d.mo9550n();
                    }
                    String stringExtra = intent.getStringExtra("component_pkg");
                    String stringExtra2 = intent.getStringExtra("component_cls");
                    C4578c cVar = C4578c.this;
                    if (!(stringExtra == null || stringExtra2 == null)) {
                        componentName = new ComponentName(stringExtra, stringExtra2);
                    }
                    cVar.m20004i(context, booleanExtra2, componentName);
                    return;
                }
                String stringExtra3 = intent.getStringExtra("pck");
                if (TextUtils.equals(stringExtra3, C4578c.this.f13286c.getPackageName())) {
                    int intExtra = intent.getIntExtra("message_type", -1);
                    C4575a.m19992f(stringExtra3 + " unbind type=" + intExtra);
                    if (C4578c.this.f13287d != null) {
                        C4578c.this.f13287d.mo9531B(true, intExtra);
                    }
                    try {
                        if (C4578c.this.f13285b != null) {
                            C4578c.this.f13286c.unbindService(C4578c.this.f13285b);
                        }
                    } catch (Exception unused) {
                    }
                    Messenger unused2 = C4578c.this.f13288e = null;
                }
            }
        }
    }

    /* renamed from: f.c.h.c$b */
    /* compiled from: MusicMasterManager */
    class C4580b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ boolean f13292g;

        /* renamed from: h */
        final /* synthetic */ Context f13293h;

        C4580b(C4578c cVar, boolean z, Context context) {
            this.f13292g = z;
            this.f13293h = context;
        }

        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C4575a.m19988b("bindEqSlave2");
            Intent intent = new Intent("coocent_music_ask_bind_eq_info");
            intent.putExtra("initiative", this.f13292g);
            Context context = (Context) new WeakReference(this.f13293h).get();
            if (context != null) {
                context.sendBroadcast(intent);
            }
        }
    }

    /* renamed from: f.c.h.c$c */
    /* compiled from: MusicMasterManager */
    private class C4581c extends Handler {
        private C4581c() {
        }

        public void handleMessage(Message message) {
            C4575a.m19992f("ClientHandler_handleMessage_msg.what=" + message.what);
            int i = message.what;
            if (i == 992) {
                Bundle data = message.getData();
                if (data != null) {
                    boolean z = data.getBoolean("isEqStatus", true);
                    String string = data.getString("pck");
                    int i2 = data.getInt("message_type", -1);
                    C4575a.m19992f("isEqStatus=" + z);
                    if (z) {
                        if (C4578c.this.f13287d != null) {
                            C4578c.this.f13287d.mo9550n();
                        }
                        C4578c.this.mo15327k(false, false, i2);
                    } else if (C4578c.this.f13287d != null && TextUtils.equals(C4578c.this.f13286c.getPackageName(), string)) {
                        C4578c.this.f13287d.mo9531B(true, i2);
                    }
                }
            } else if (i == 994) {
                C4575a.m19992f("unbind slave");
                try {
                    if (C4578c.this.f13285b != null) {
                        C4578c.this.f13286c.unbindService(C4578c.this.f13285b);
                    }
                } catch (Exception unused) {
                }
                Messenger unused2 = C4578c.this.f13288e = null;
            }
        }

        /* synthetic */ C4581c(C4578c cVar, C4579a aVar) {
            this();
        }
    }

    /* renamed from: f.c.h.c$d */
    /* compiled from: MusicMasterManager */
    private static class C4582d implements ServiceConnection {

        /* renamed from: g */
        private final boolean f13295g;

        /* renamed from: h */
        private final WeakReference<C4578c> f13296h;

        public C4582d(C4578c cVar, boolean z) {
            this.f13296h = new WeakReference<>(cVar);
            this.f13295g = z;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4578c cVar = (C4578c) this.f13296h.get();
            if (cVar != null) {
                C4575a.m19992f("客户端 onServiceConnected");
                Messenger unused = cVar.f13288e = new Messenger(iBinder);
                Message obtain = Message.obtain();
                obtain.what = 991;
                Bundle bundle = new Bundle();
                bundle.putString("msg", "成功连接服务端");
                bundle.putString("pck", cVar.f13286c.getPackageName());
                bundle.putBoolean("initiative", this.f13295g);
                obtain.setData(bundle);
                obtain.replyTo = cVar.f13289f;
                try {
                    C4575a.m19988b("客户端发送信息");
                    cVar.f13288e.send(obtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    C4575a.m19989c("客户端发送消息失败: " + e.getMessage());
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C4578c cVar = (C4578c) this.f13296h.get();
            if (cVar != null) {
                Messenger unused = cVar.f13288e = null;
                C4575a.m19989c("客户端 onServiceDisconnected");
            }
        }
    }

    public C4578c(Context context, C4576b.C4577a aVar) {
        this.f13286c = context;
        this.f13287d = aVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("coocent_eq_ask_music_bind_eq_service");
        context.registerReceiver(this.f13290g, intentFilter);
        m20003h(context, true);
    }

    /* renamed from: h */
    private void m20003h(Context context, boolean z) {
        C4575a.m19988b("bindEqSlave");
        Thread thread = this.f13284a;
        if (thread != null && !thread.isInterrupted()) {
            this.f13284a.interrupt();
        }
        Thread thread2 = new Thread(new C4580b(this, z, context));
        this.f13284a = thread2;
        thread2.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m20004i(Context context, boolean z, ComponentName componentName) {
        try {
            ServiceConnection serviceConnection = this.f13285b;
            if (serviceConnection != null) {
                this.f13286c.unbindService(serviceConnection);
            }
        } catch (Exception unused) {
        }
        boolean z2 = false;
        if (componentName != null) {
            this.f13285b = new C4582d(this, z);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.setPackage(context.getPackageName());
            intent.putExtra("initiative", z);
            intent.setType(context.getPackageName());
            try {
                z2 = context.bindService(intent, this.f13285b, 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                C4575a.m19991e(e);
            }
        }
        if (z2) {
            C4575a.m19990d("成功绑定" + componentName.getPackageName() + "_" + componentName.getClassName());
            return;
        }
        C4575a.m19990d("未绑定任何EQ应用");
    }

    /* renamed from: j */
    public void mo15326j() {
        Thread thread = this.f13284a;
        if (thread != null && !thread.isInterrupted()) {
            this.f13284a.interrupt();
        }
        Context context = this.f13286c;
        if (context != null) {
            try {
                ServiceConnection serviceConnection = this.f13285b;
                if (serviceConnection != null) {
                    context.unbindService(serviceConnection);
                }
            } catch (Exception e) {
                C4575a.m19991e(e);
            }
            Intent intent = new Intent("coocent_music_ask_unbind_eq");
            intent.putExtra("pck", this.f13286c.getPackageName());
            this.f13286c.sendBroadcast(intent);
            this.f13286c.unregisterReceiver(this.f13290g);
        }
        this.f13288e = null;
        C4575a.m19988b("unbindService");
    }

    /* renamed from: k */
    public boolean mo15327k(boolean z, boolean z2, int i) {
        C4575a.m19992f("sendToMaster_effect_on=" + z);
        if (this.f13288e != null) {
            Message obtain = Message.obtain();
            obtain.what = 993;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isEqStatus", z);
            bundle.putInt("message_type", i);
            if (z2) {
                bundle.putString("pck", this.f13286c.getPackageName());
            }
            obtain.setData(bundle);
            try {
                this.f13288e.send(obtain);
                C4575a.m19992f(this.f13288e + "客户端发送信息");
                return true;
            } catch (RemoteException e) {
                m20003h(this.f13286c, true);
                e.printStackTrace();
                C4575a.m19989c("客户端发送信息失败: " + e.getMessage());
                return false;
            }
        } else {
            C4575a.m19993g("serviceMessenger is null ! 不能发送信息给Slave");
            try {
                ServiceConnection serviceConnection = this.f13285b;
                if (serviceConnection != null) {
                    this.f13286c.unbindService(serviceConnection);
                }
            } catch (Exception unused) {
            }
            Intent intent = new Intent("coocent_music_ask_unbind_eq");
            intent.putExtra("pck", this.f13286c.getPackageName());
            this.f13286c.sendBroadcast(intent);
            return false;
        }
    }

    /* renamed from: l */
    public void mo15328l(boolean z, int i) {
        C4576b.C4577a aVar;
        if (!z) {
            C4576b.C4577a aVar2 = this.f13287d;
            if (aVar2 != null) {
                aVar2.mo9531B(false, i);
            }
        } else if (!mo15327k(true, true, i) && (aVar = this.f13287d) != null) {
            aVar.mo9531B(true, i);
        }
    }
}
