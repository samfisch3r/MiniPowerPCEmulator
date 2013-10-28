package ch.minipowerpc.emulator.instructions;

import ch.minipowerpc.emulator.IALU;
import ch.minipowerpc.emulator.Registers.NamedRegister;

public class BZ extends RegisterInstruction {
	
	public BZ(IALU alu, NamedRegister register) {
		super(alu, register);
	}

	public boolean run() {
		alu.BZ(register);
		return true;
	}
	
	@Override
	public String toString() {
		return "BZ " + register.toString();
	}
}
