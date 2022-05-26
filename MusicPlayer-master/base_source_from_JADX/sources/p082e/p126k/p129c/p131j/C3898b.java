package p082e.p126k.p129c.p131j;

import p082e.p126k.p129c.p131j.C4012s0;

/* renamed from: e.k.c.j.b */
/* compiled from: AbstractParser */
public abstract class C3898b<MessageType extends C4012s0> implements C3909b1<MessageType> {
    static {
        C4003q.m17482b();
    }

    /* renamed from: c */
    private MessageType m16640c(MessageType messagetype) throws C3911c0 {
        if (messagetype == null || messagetype.mo13976i()) {
            return messagetype;
        }
        throw m16641d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: d */
    private C4002p1 m16641d(MessageType messagetype) {
        if (messagetype instanceof C3893a) {
            return ((C3893a) messagetype).mo13405n();
        }
        return new C4002p1((C4012s0) messagetype);
    }

    /* renamed from: e */
    public MessageType mo13457a(C3934i iVar, C4003q qVar) throws C3911c0 {
        MessageType f = mo13459f(iVar, qVar);
        m16640c(f);
        return f;
    }

    /* renamed from: f */
    public MessageType mo13459f(C3934i iVar, C4003q qVar) throws C3911c0 {
        MessageType messagetype;
        try {
            C3956j newCodedInput = iVar.newCodedInput();
            messagetype = (C4012s0) mo13465b(newCodedInput, qVar);
            newCodedInput.mo13645a(0);
            return messagetype;
        } catch (C3911c0 e) {
            throw e.setUnfinishedMessage(messagetype);
        } catch (C3911c0 e2) {
            throw e2;
        }
    }
}
