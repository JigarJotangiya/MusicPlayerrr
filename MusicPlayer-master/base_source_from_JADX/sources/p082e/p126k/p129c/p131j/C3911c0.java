package p082e.p126k.p129c.p131j;

import java.io.IOException;

/* renamed from: e.k.c.j.c0 */
/* compiled from: InvalidProtocolBufferException */
public class C3911c0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private C4012s0 unfinishedMessage = null;

    /* renamed from: e.k.c.j.c0$a */
    /* compiled from: InvalidProtocolBufferException */
    public static class C3912a extends C3911c0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public C3912a(String str) {
            super(str);
        }
    }

    public C3911c0(String str) {
        super(str);
    }

    static C3911c0 invalidEndTag() {
        return new C3911c0("Protocol message end-group tag did not match expected tag.");
    }

    static C3911c0 invalidTag() {
        return new C3911c0("Protocol message contained an invalid tag (zero).");
    }

    static C3911c0 invalidUtf8() {
        return new C3911c0("Protocol message had invalid UTF-8.");
    }

    static C3912a invalidWireType() {
        return new C3912a("Protocol message tag had invalid wire type.");
    }

    static C3911c0 malformedVarint() {
        return new C3911c0("CodedInputStream encountered a malformed varint.");
    }

    static C3911c0 negativeSize() {
        return new C3911c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C3911c0 parseFailure() {
        return new C3911c0("Failed to parse the message.");
    }

    static C3911c0 recursionLimitExceeded() {
        return new C3911c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C3911c0 sizeLimitExceeded() {
        return new C3911c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C3911c0 truncatedMessage() {
        return new C3911c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C4012s0 getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public C3911c0 setUnfinishedMessage(C4012s0 s0Var) {
        this.unfinishedMessage = s0Var;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public C3911c0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public C3911c0(String str, IOException iOException) {
        super(str, iOException);
    }
}
