package com.scalaAsm.x86
package Instructions
package General

// Description: Set Byte on Condition - below/not above or equal/carry (CF=1)
// Category: general/datamov

trait SETC extends InstructionDefinition {
  val mnemonic = "SETC"
}

object SETC extends OneOperand[SETC] with SETCImpl

trait SETCImpl extends SETC {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x92) /+ 0
    val format = RmFormat
  }
}
