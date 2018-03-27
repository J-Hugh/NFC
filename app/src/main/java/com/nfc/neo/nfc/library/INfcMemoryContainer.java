package com.nfc.neo.nfc.library;

public interface INfcMemoryContainer {
	public short[] AllocateItem(int byteCount) throws NfcException;
}
