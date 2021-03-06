package com.scalaAsm.x86
package Instructions
package General

// Description: Interrupt Return
// Category: general/breakstack

trait IRET extends InstructionDefinition {
  val mnemonic = "IRET"
}

object IRET extends ZeroOperands[IRET] with IRETImpl

trait IRETImpl extends IRET {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xCF
        override def hasImplicitOperand = true
  }
}
