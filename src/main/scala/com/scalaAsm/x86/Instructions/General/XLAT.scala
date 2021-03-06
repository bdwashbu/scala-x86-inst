package com.scalaAsm.x86
package Instructions
package General

// Description: Table Look-up Translation
// Category: general/datamov

trait XLAT extends InstructionDefinition {
  val mnemonic = "XLAT"
}

object XLAT extends ZeroOperands[XLAT] with XLATImpl

trait XLATImpl extends XLAT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD7
        override def hasImplicitOperand = true
  }
}
