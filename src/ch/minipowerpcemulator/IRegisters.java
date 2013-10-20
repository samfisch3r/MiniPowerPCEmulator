package ch.minipowerpcemulator;

import ch.minipowerpcemulator.Registers.NamedRegister;

public interface IRegisters {
	/**
	 * Initializes the registers by setting them to 0
	 */
	void initialize();
	short get(NamedRegister register);
	void set(NamedRegister register);
	void set(NamedRegister register, short value);
}
