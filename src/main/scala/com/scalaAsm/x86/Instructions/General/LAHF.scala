package com.scalaAsm.x86
package Instructions
package General

// Description: Load Status Flags into AH Register
// Category: general/datamovflgctrl

trait LAHF extends InstructionDefinition {
  val mnemonic = "LAHF"
}

object LAHF extends ZeroOperands[LAHF] with LAHFImpl

trait LAHFImpl extends LAHF {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9F
        override def hasImplicitOperand = true
  }
}
