package com.scalaAsm.x86
package Instructions
package System

// Description: Clear Task-Switched Flag in CR0
// Category: general

trait CLTS extends InstructionDefinition {
  val mnemonic = "CLTS"
}

object CLTS extends ZeroOperands[CLTS] with CLTSImpl

trait CLTSImpl extends CLTS {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x06)
        override def hasImplicitOperand = true
  }
}
