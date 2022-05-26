package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.nm3;
import com.google.android.gms.internal.ads.qm3;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class nm3<MessageType extends qm3<MessageType, BuilderType>, BuilderType extends nm3<MessageType, BuilderType>> extends uk3<MessageType, BuilderType> {

    /* renamed from: g */
    private final MessageType f20665g;

    /* renamed from: h */
    protected MessageType f20666h;

    /* renamed from: i */
    protected boolean f20667i = false;

    protected nm3(MessageType messagetype) {
        this.f20665g = messagetype;
        this.f20666h = (qm3) messagetype.mo15709C(4, (Object) null, (Object) null);
    }

    /* renamed from: j */
    private static final void m27937j(MessageType messagetype, MessageType messagetype2) {
        io3.m25345a().mo18467b(messagetype.getClass()).mo16709h(messagetype, messagetype2);
    }

    /* renamed from: c */
    public final /* synthetic */ zn3 mo15911c() {
        return this.f20665g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* synthetic */ uk3 mo19757i(vk3 vk3) {
        mo19759l((qm3) vk3);
        return this;
    }

    /* renamed from: k */
    public final BuilderType clone() {
        BuilderType buildertype = (nm3) this.f20665g.mo15709C(5, (Object) null, (Object) null);
        buildertype.mo19759l(mo19755Q());
        return buildertype;
    }

    /* renamed from: l */
    public final BuilderType mo19759l(MessageType messagetype) {
        if (this.f20667i) {
            mo19763q();
            this.f20667i = false;
        }
        m27937j(this.f20666h, messagetype);
        return this;
    }

    /* renamed from: m */
    public final BuilderType mo19760m(byte[] bArr, int i, int i2, cm3 cm3) throws bn3 {
        if (this.f20667i) {
            mo19763q();
            this.f20667i = false;
        }
        try {
            io3.m25345a().mo18467b(this.f20666h.getClass()).mo16707f(this.f20666h, bArr, 0, i2, new yk3(cm3));
            return this;
        } catch (bn3 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw bn3.zzj();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: n */
    public final MessageType mo19761n() {
        MessageType o = mo19755Q();
        if (o.mo20476u()) {
            return o;
        }
        throw new kp3(o);
    }

    /* renamed from: o */
    public MessageType mo19755Q() {
        if (this.f20667i) {
            return this.f20666h;
        }
        MessageType messagetype = this.f20666h;
        io3.m25345a().mo18467b(messagetype.getClass()).mo16704c(messagetype);
        this.f20667i = true;
        return this.f20666h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo19763q() {
        MessageType messagetype = (qm3) this.f20666h.mo15709C(4, (Object) null, (Object) null);
        m27937j(messagetype, this.f20666h);
        this.f20666h = messagetype;
    }
}
