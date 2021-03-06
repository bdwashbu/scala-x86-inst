package com.scalaAsm.x86
package Instructions
package x87

// Description: Add
// Category: general/arith

trait FIADD extends InstructionDefinition {
  val mnemonic = "FIADD"
}

object FIADD extends OneOperand[FIADD] with FIADDImpl

trait FIADDImpl extends FIADD {
  implicit object _0 extends OneOp[m32] {
    val opcode: OneOpcode = 0xDA /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object _1 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDE /+ 0
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
