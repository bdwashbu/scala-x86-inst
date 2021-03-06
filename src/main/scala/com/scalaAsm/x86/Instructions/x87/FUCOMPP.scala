package com.scalaAsm.x86
package Instructions
package x87

// Description: Unordered Compare Floating Point Values and Pop Twice
// Category: general/compar

trait FUCOMPP extends InstructionDefinition {
  val mnemonic = "FUCOMPP"
}

object FUCOMPP extends ZeroOperands[FUCOMPP] with FUCOMPPImpl

trait FUCOMPPImpl extends FUCOMPP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDA /+ 5
        override def hasImplicitOperand = true
  }
}
