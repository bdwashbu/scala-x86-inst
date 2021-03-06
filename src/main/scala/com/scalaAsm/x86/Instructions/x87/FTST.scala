package com.scalaAsm.x86
package Instructions
package x87

// Description: Test
// Category: general/compar

trait FTST extends InstructionDefinition {
  val mnemonic = "FTST"
}

object FTST extends ZeroOperands[FTST] with FTSTImpl

trait FTSTImpl extends FTST {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
